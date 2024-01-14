package oopSeminar5.task4;

public class Main {
    public static void main(String[] args) {
        InternerShopModel model = new InternerShopModel();
        InternetShopView view = new InternetShopView();
        InternetShopControler presenter = new InternetShopControler(model, view);

        presenter.run();
    }
}
