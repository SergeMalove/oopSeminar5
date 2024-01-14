package oopSeminar5.task3;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public double getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public char getUserOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
