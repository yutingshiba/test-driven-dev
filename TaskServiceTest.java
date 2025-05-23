import java.util.Comparator;
import java.util.List;

public class TaskServiceTest {

    private final TaskService service = new TaskService();

    /* Helper to count passed tests */
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        TaskServiceTest t = new TaskServiceTest();
        t.runAll();
        System.out.printf("%nPassed: %d, Failed: %d%n", passed, failed);
        if (failed > 0) System.exit(1);
    }

    private void runAll() {
        run(this::addTask_shouldReturnTaskWithGeneratedId);
        run(this::addTask_shouldTrimTitleAndDescription);
        run(this::editTask_shouldUpdateTitleAndDescription);
        run(this::listTasks_shouldReturnTasksInInsertionOrder);
        run(this::listTasks_shouldReturnTasksInCustomOrder);
    }

    /* -------- addTask() -------- */
    void addTask_shouldReturnTaskWithGeneratedId() {
        // TODO: Arrange - Act - Assert
    }

    void addTask_shouldTrimTitleAndDescription() {
        // TODO
    }

    /* -------- editTask() -------- */
    void editTask_shouldUpdateTitleAndDescription() {
        // TODO
    }

    /* ----- tiny runner ----- */
    private void run(Runnable r) {
        try {
            r.run();
            passed++;
            System.out.print(".");
        } catch (AssertionError e) {
            failed++;
            System.out.println("\n❌ " + e.getMessage());
        } catch (Exception ex) {
            failed++;
            System.out.println("\n💥 " + ex);
        }
    }

    /* simple assert helpers */
    static void assertEquals(Object expected, Object actual) {
        assert (expected == null ? actual == null : expected.equals(actual)) :
                ("Expected " + expected + " but got " + actual);
    }

    static void assertTrue(boolean condition, String message) {
        assert condition : message;
    }
}
