import java.time.Instant;
import java.util.*;

public class TaskService {

    private final Map<String, Task> tasks = new LinkedHashMap<>();

    /**
     * Adds a new task and returns the created Task.
     * Title & description should be trimmed; id is generated.
     */
    public Task addTask(String title, String description) {
        // TODO: implement
        return null;
    }

    /**
     * Updates an existing task and returns the updated Task.
     * If task id does not exist, throw IllegalArgumentException.
     */
    public Task editTask(String id, String newTitle, String newDescription) {
        // TODO: implement
        return null;
    }

    /**
     * Returns tasks in insertion order (default).
     */
    public List<Task> listTasks() {
        // TODO: implement
        return null;
    }

    /**
     * Returns tasks ordered by a custom comparator.
     */
    public List<Task> listTasks(Comparator<Task> order) {
        // TODO: implement
        return null;
    }
}