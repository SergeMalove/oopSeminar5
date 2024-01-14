package oopSeminar5.task4;

public class InternetShopControler {
    private InternerShopModel isModel;
    private InternetShopView isView;

    public InternetShopControler(InternerShopModel isModel, InternetShopView isView) {
        this.isModel = isModel;
        this.isView = isView;
    }

    public void run() {
        boolean work = true;

        while (work) {
            isView.displayCart(isModel.getCart());

            String userInput = isView.getUserInput();

            if (!userInput.isEmpty()) {
                isModel.addGood(userInput);
            }

            isView.displayCart(isModel.getCart());

            String unput = isView.userInput();
            if (unput.equals("1")) {
                isModel.removeGood(0);
            }

            isView.displayCart(isModel.getCart());
            System.out.println("Хотете выйти из программы? 1 - Выход, 0 - Продолжить работу\n");
            String flag = isView.getUserInput();

            if (flag.equals("1")) {
                work = false;
            }
        }
    }
}
