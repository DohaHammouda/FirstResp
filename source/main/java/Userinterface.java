package SoftwareEnginerring;

import java.util.Scanner;

public class Userinterface {
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