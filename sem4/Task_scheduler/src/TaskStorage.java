import java.util.List;
public interface TaskStorage<T extends Task> {

    void add(T task);

    void delete(int id);

    T getByID(int id);

    List<T> getAll();
}
