package oopSeminar5.task1;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<String> tasks) {
        System.out.println("������ �����:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public String getUserInput() {
        System.out.print("������� ����� ������: ");
        return scanner.nextLine();
    }

    public int getTaskIndexToRemove() {
        System.out.print("������� ����� ������ ��� ��������: ");
        return scanner.nextInt() - 1;
    }
}
