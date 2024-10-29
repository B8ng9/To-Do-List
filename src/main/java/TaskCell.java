import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.HBox;
import javafx.scene.text.Text;

public class TaskCell extends ListCell<Task> {
    HBox hbox = new HBox();
    Text title = new Text();
    Button completeButton = new Button("Complete");
    Button deleteButton = new Button("Delete");

    public TaskCell() {
        hbox.getChildren().addAll(title, completeButton, deleteButton);

        completeButton.setOnAction(e -> {
            getItem().setStatus("completed");
            setText(getItem().toString());
        });

        deleteButton.setOnAction(e -> {
        });
    }

    @Override
    protected void updateItem(Task task, boolean empty) {
        super.updateItem(task, empty);
        if (empty || task == null) {
            setText(null);
            setGraphic(null);
        } else {
            title.setText(task.getTitle());
            setGraphic(hbox);
        }
    }
}
