import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Task {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private static int nextID = 1;


    private int id;
    private String authorName;
    private Priority priority;
    private String description;
    private LocalDateTime taskDateTime;
    private LocalDateTime deadlineDateTime;

//    private int idnum;

    public Task(String authorName, Priority priority, String description, LocalDateTime taskDateTime, LocalDateTime deadlineDateTime){
        this.id = nextID++;
        this.authorName = authorName;
        this.priority = priority;
        this.description = description;
        this.taskDateTime = taskDateTime;
        this.deadlineDateTime = deadlineDateTime;
    }

    public int getID() {
        return id;
    }

    public LocalDateTime getAddedDateTime() {
        return taskDateTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", начало срока=" + taskDateTime.format(dtf) +
                ", дедлайн=" + deadlineDateTime.format(dtf) +
                ", приоритет=" + priority +
                ", имя автора='" + authorName + '\'' +
                ", описание='" + description + '\'' +
                '}';
    }
}
