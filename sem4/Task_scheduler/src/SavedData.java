import java.util.ArrayList;
import java.util.List;

class SavedData implements TaskStorage{
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public void delete(int id) {
        tasks.removeIf(task -> task.getID() == id);
    }

    @Override
    public Task getByID(int id) {
        for (Task task : tasks) {
            if (task.getID() == id) {
                return task;
            }
        }
        return null;
    }

    @Override
    public List getAll() {
        return tasks;
    }
}
