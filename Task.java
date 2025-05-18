import java.time.Instant;

public record Task(String id, String title, String description, Instant createdAt) {}