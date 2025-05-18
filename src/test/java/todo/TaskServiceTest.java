package todo;

import org.junit.jupiter.api.*;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    private TaskService service;

    @BeforeEach
    void setup() {
        service = new TaskService();
    }

    /* -------- addTask() -------- */
    @Test
    void addTask_shouldReturnTaskWithGeneratedId() {
        // TODO: Arrange - Act - Assert
    }

    @Test
    void addTask_shouldTrimTitleAndDescription() {
        // TODO
    }

    /* -------- editTask() -------- */
    @Test
    void editTask_shouldUpdateTitleAndDescription() {
        // TODO
    }

    /* -------- listTasks() -------- */
    @Test
    void listTasks_shouldReturnTasksInInsertionOrder_byDefault() {
        // TODO
    }

    @Test
    void listTasks_shouldReturnTasksInCustomOrder() {
        // TODO
    }
}