package oopSeminar5.task4;

import java.util.List;
import java.util.Scanner;

public class InternetShopView {
    private Scanner scanner;

    public InternetShopView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayCart(List<String> cart) {
        System.out.println("������ �������:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
    }

    public String getUserInput() {
        System.out.print("�������� ����� �����: ");
        return scanner.nextLine();
    }

    public int getGoodIndexToRemove() {
        System.out.print("������� ����� ������ ��� �������� �� �������: ");
        return scanner.nextInt() - 1;
    }

    public String userInput () {
        System.out.print("������� ������? 1 - ��, 0 - ���\n");
        return scanner.nextLine();
    }
}
