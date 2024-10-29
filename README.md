# To-Do List Application

This is a simple and intuitive To-Do List application built using JavaFX and SQLite. The application enables users to manage their tasks with ease, providing functionalities to add, edit, mark as complete, and delete tasks. The app is designed with a clean and user-friendly interface, making task management straightforward and efficient.

## Features

- **Add New Tasks**: Users can create tasks by adding titles, descriptions, priorities, and due dates.
- **Edit Tasks**: Allows for editing existing tasks to modify details such as title or description.
- **Complete/Incomplete Tasks**: Mark tasks as completed or active, helping users keep track of their progress.
- **Delete Tasks**: Remove tasks from the list when they are no longer needed.
- **Data Persistence**: All tasks are saved locally in an SQLite database, ensuring data is retained between sessions.

## Installation and Setup

### Prerequisites

To run this application, you will need:
- **Java JDK 8** or later.
- **JavaFX SDK**: Download the SDK from [Gluon’s JavaFX page](https://gluonhq.com/products/javafx/).
- **SQLite JDBC Driver**: The app uses SQLite for data storage, so ensure the appropriate driver is available in your project.

### Setting Up the Project

1. **Clone the Repository**: Start by cloning the repository to your local machine.

   ```bash
   git clone https://github.com/YOUR_USERNAME/ToDoListApp.git
   cd ToDoListApp
   ```

2. **Open in IntelliJ IDEA**:
   - Open IntelliJ IDEA, go to **File > Open**, and select the cloned repository folder.
   - Ensure you have set up the JavaFX library within IntelliJ. (See below for instructions if needed).

3. **Configure JavaFX Library**:
   - Go to **File > Project Structure > Libraries** in IntelliJ.
   - Add the JavaFX SDK by pointing to the `lib` folder inside your downloaded JavaFX directory.
   - Set VM options in IntelliJ’s Run Configurations as follows:
   
     ```plaintext
     --module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml
     ```

4. **Run the Application**:
   - Locate the main class, `TaskManagerApp`, in the `src/main` directory.
   - Right-click on the class and select **Run** to start the application.

## How to Use the To-Do List App

1. **Home Screen**:
   - Displays the list of all tasks, showing their title, completion status, and priority.

2. **Adding Tasks**:
   - Click on the **Add Task** button.
   - Enter the title, description (optional), priority level, and due date, then save the task.

3. **Editing Tasks**:
   - Select a task from the list and choose the **Edit** option.
   - Modify the details as needed and save the changes.

4. **Marking Tasks as Complete**:
   - To mark a task as complete, click on the task and choose the **Complete** option.
   - You can also revert completed tasks to active status if needed.

5. **Deleting Tasks**:
   - Select a task and click **Delete** to remove it permanently from the list.

## Project Structure

The main components of the application are organized as follows:

```plaintext
ToDoListApp/
├── src/
│   ├── main/
│   │   ├── TaskManagerApp.java      # Main application class
│   │   ├── controller/
│   │   │   └── TaskController.java  # Controls application logic
│   │   └── model/
│   │       └── Task.java            # Task model with attributes and methods
│   ├── resources/
│       └── fxml/
│           └── Main.fxml            # FXML file for the user interface layout
└── tasks.db                         # SQLite database file for task storage
```

- **TaskManagerApp.java**: Main entry point of the application, initializing the JavaFX UI.
- **TaskController.java**: Handles user interactions, including adding, editing, and deleting tasks.
- **Task.java**: Represents the task model, including fields for title, description, priority, and completion status.
- **Main.fxml**: Defines the UI layout and components of the application.

## Contributing

If you'd like to contribute to this project, you’re welcome to open issues or submit pull requests with your improvements or bug fixes. Contributions are greatly appreciated to help improve the app for other users.

1. **Fork the Repository**.
2. **Create a Feature Branch**.
3. **Commit Changes** with clear, descriptive messages.
4. **Push to Your Fork**.
5. Open a **Pull Request** on the main repository.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software in accordance with the license. See the `LICENSE` file for more information.

---
