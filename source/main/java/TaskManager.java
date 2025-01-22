package SoftwareEnginerring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description, int priority) {
        tasks.add(new Task(title, description, priority));
        System.out.println("Task added successfully.");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        tasks.sort(Comparator.comparingInt(Task::getPriority));
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i)); // Display tasks with 1-based indexing
        }
    }

    public void markTaskComplete(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            tasks.get(taskIndex - 1).markComplete(); // Mark task as complete
            System.out.println("Task marked as complete.");
        }
    }

    public void deleteTask(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            tasks.remove(taskIndex - 1); // Remove task from list
            System.out.println("Task deleted successfully.");
        }
    }

    private boolean isValidIndex(int taskIndex) {
        if (taskIndex < 1 || taskIndex > tasks.size()) {
            System.out.println("Invalid task index.");
            return false;
        }
        return true;
    }

    // Get the count of tasks
    public int getTaskCount() {
        return tasks.size();
    }
}