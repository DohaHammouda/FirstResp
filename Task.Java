//This is dummy comment number 2

package SoftwareEnginerring;

public class Task {
    private String title;
    private String description;
    private int priority;
    private boolean isComplete;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return (isComplete ? "[✔] " : "[ ] ") +
                "Title: " + title +
                ", Priority: " + priority +
                ", Description: " + description;
    }
}
