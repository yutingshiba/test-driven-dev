# Todo-App TDD Workshop (Plain Java Edition)

No Maven/Gradle — just raw `javac` / `java`.

## Compile & Run Tests

```bash
javac *.java
java -ea TaskServiceTest   # `-ea` enables Java assertions
```

All test methods are empty — write a failing assertion first (Red),
implement in `TaskService` until green, then refactor.