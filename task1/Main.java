package oopSeminar5.task1;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskPresenter presenter = new TaskPresenter(model, view);

        presenter.run();
    }
}
