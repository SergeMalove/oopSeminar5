package oopSeminar5.task4;

import java.util.ArrayList;
import java.util.List;

public class InternerShopModel {
    private List<String> cart;

    public InternerShopModel() {
        this.cart = new ArrayList<>();
    }

    public void setCart(List<String> cart) {
        this.cart = cart;
    }

    public void addGood (String good) {
        this.cart.add(good);
    }

    public void removeGood (int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
        }
    }

    public List<String> getCart() {
        return cart;
    }
}
