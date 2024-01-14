package oopSeminar5.task1;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<String> tasks) {
        System.out.println("—писок задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public String getUserInput() {
        System.out.print("¬ведите новую задачу: ");
        return scanner.nextLine();
    }

    public int getTaskIndexToRemove() {
        System.out.print("¬ведите номер задачи дл€ удалени€: ");
        return scanner.nextInt() - 1;
    }
}
