package oopSeminar5.task2;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    Scanner scanner;

    public ContactView() {
        scanner = new Scanner(System.in);
    }

    public void displayContacts(List<Contact> contacts) {
        System.out.println("Список контактов:");
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " (" + contact.getEmail() + ")");
        }
    }

    public int getUserChoice() {
        System.out.print("Выберите контакт (номер): ");
        return scanner.nextInt();
    }

    public void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить контакт");
        System.out.println("2. Показать все контакты");
        System.out.println("3. Выход");
    }
}
