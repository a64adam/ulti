package dto.status;

import java.util.List;

public class Message {

    private String author;
    private String content;
    private String createdAt;
    private long id;
    private String severity;
    private List<Translation> translations;
    private String updatedAt;

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public String getSeverity() {
        return severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
