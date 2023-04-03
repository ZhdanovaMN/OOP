import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TaskManager<T extends Task> {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private TaskStorage<T> taskStorage;
//    private Exporter taskExporter;
//    private Importer taskImporter;

    public TaskManager() {
        this.taskStorage = taskStorage;
    }


    public void addTask(String authorName, Priority priority, String description, LocalDateTime taskDateTime, LocalDateTime deadlineDateTime) {
        T task = (T) new Task(authorName, priority, description, taskDateTime, deadlineDateTime);
        taskStorage.add(task);
    }
    public void addTaskID(int id, String authorName, Priority priority, String description, LocalDateTime taskDateTime, LocalDateTime deadlineDateTime) {
        T task = (T) new Task(authorName, priority, description, taskDateTime, deadlineDateTime);
        taskStorage.add(task);
    }

    public void deleteTask(int id) {
        taskStorage.delete(id);
    }

    public T getTaskByID(int id) {
        return taskStorage.getByID(id);
    }
    public List<T> getAllTasks() {
        return taskStorage.getAll();
    }
}