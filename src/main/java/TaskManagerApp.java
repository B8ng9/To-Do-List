import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskManagerApp extends Application {

    private ObservableList<Task> tasks;
    private TaskDAO taskDAO = new TaskDAO();

    @Override
    public void start(Stage primaryStage) {
        tasks = FXCollections.observableArrayList(taskDAO.getAllTasks());
        
        ListView<Task> listView = new ListView<>(tasks);
        listView.setCellFactory(param -> new TaskCell());

        Button addButton = new Button("Add Task");
        addButton.setOnAction(e -> openAddTaskDialog());

        VBox vbox = new VBox(10, listView, addButton);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("To-Do List App");
        primaryStage.show();
    }

    private void openAddTaskDialog() {
        Stage dialog = new Stage();
        dialog.setTitle("Add Task");

        TextField titleField = new TextField();
        titleField.setPromptText("Title");

        TextField descriptionField = new TextField();
        descriptionField.setPromptText("Description");

        ChoiceBox<Integer> priorityBox = new ChoiceBox<>(FXCollections.observableArrayList(1, 2, 3));
        priorityBox.setValue(1);

        DatePicker dueDatePicker = new DatePicker();

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String title = titleField.getText();
            String description = descriptionField.getText();
            int priority = priorityBox.getValue();
            String dueDate = dueDatePicker.getValue() != null ? dueDatePicker.getValue().toString() : null;

            Task task = new Task(title, description, priority, dueDate, "active");
            taskDAO.addTask(task);
            tasks.add(task);

            dialog.close();
        });

        VBox vbox = new VBox(10, titleField, descriptionField, priorityBox, dueDatePicker, saveButton);
        vbox.setAlignment(Pos.CENTER);

        Scene dialogScene = new Scene(vbox, 300, 250);
        dialog.setScene(dialogScene);
        dialog.show();
    }

    public static void main(String[] args) {
        Database.createTable();
        launch(args);
    }
}
