package oopSeminar5.task4;

import java.util.List;
import java.util.Scanner;

public class InternetShopView {
    private Scanner scanner;

    public InternetShopView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayCart(List<String> cart) {
        System.out.println("Список товаров:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
    }

    public String getUserInput() {
        System.out.print("Добавьте новый товар: ");
        return scanner.nextLine();
    }

    public int getGoodIndexToRemove() {
        System.out.print("Введите номер товара для удаления из корзины: ");
        return scanner.nextInt() - 1;
    }

    public String userInput () {
        System.out.print("Удалить запись? 1 - Да, 0 - Нет\n");
        return scanner.nextLine();
    }
}
