package oopSeminar5.task2;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    Scanner scanner;

    public ContactView() {
        scanner = new Scanner(System.in);
    }

    public void displayContacts(List<Contact> contacts) {
        System.out.println("������ ���������:");
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " (" + contact.getEmail() + ")");
        }
    }

    public int getUserChoice() {
        System.out.print("�������� ������� (�����): ");
        return scanner.nextInt();
    }

    public void showMenu() {
        System.out.println("����:");
        System.out.println("1. �������� �������");
        System.out.println("2. �������� ��� ��������");
        System.out.println("3. �����");
    }
}
