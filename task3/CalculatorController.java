package oopSeminar5.task3;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void greting () {
        System.out.println("��� ����������� �����������!");
    }

    public void runCalculator() {
        greting();
        double num1 = view.getUserInput("������� ������ �����: ");
        char operation = view.getUserOperation();
        double num2 = view.getUserInput("������� ������ �����: ");

        model.setNumber1(num1);
        model.setOperation(operation);
        model.setNumber2(num2);

        try {
            model.calculate();
            double result = model.getResult();
            view.displayResult(result);
        } catch (IllegalArgumentException e) {
            System.out.println("������: " + e.getMessage());
        }
    }
}
