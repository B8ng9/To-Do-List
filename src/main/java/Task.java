public class Task {
    private int id;
    private String title;
    private String description;
    private int priority;
    private String dueDate;
    private String status;

    public Task(String title, String description, int priority, String dueDate, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return title + " (" + status + ")";
    }
}
