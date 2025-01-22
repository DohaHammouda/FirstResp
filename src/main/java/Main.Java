
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//package SoftwareEnginerring;


 class Task {
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



 class TaskManager {
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
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskComplete(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            tasks.get(taskIndex - 1).markComplete();
            System.out.println("Task marked as complete.");
        }
    }

    public void deleteTask(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            tasks.remove(taskIndex - 1);
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
}


 class Userinterface {
    private TaskManager taskManager;
    private Scanner scanner;

    public Userinterface() {
        taskManager = new TaskManager();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the To-Do List Manager!");

        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    taskManager.listTasks();
                    break;
                case "3":
                    markTaskComplete();
                    break;
                case "4":
                    deleteTask();
                    break;
                case "5":
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Task");
        System.out.println("2. List Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private void addTask() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter priority (1 = High, 2 = Medium, 3 = Low): ");
        int priority = Integer.parseInt(scanner.nextLine());

        taskManager.addTask(title, description, priority);
    }

    private void markTaskComplete() {
        System.out.print("Enter task index to mark as complete: ");
        int taskIndex = Integer.parseInt(scanner.nextLine());
        taskManager.markTaskComplete(taskIndex);
    }

    private void deleteTask() {
        System.out.print("Enter task index to delete: ");
        int taskIndex = Integer.parseInt(scanner.nextLine());
        taskManager.deleteTask(taskIndex);
    }
}


public class Main {
    public static void main(String[] args) {
        
        
        
        Userinterface ui = new Userinterface();
        ui.start();
    }
}
