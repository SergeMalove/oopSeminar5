package oopSeminar5.task1;

public class TaskPresenter {
    private TaskModel model;
    private TaskView view;

    public TaskPresenter(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean running = true;

        while (running) {
            view.displayTasks(model.getTasks());

            String userInput = view.getUserInput();
            if (!userInput.isEmpty()) {
                model.addTask(userInput);
            }

            view.displayTasks(model.getTasks());

            int taskIndexToRemove = view.getTaskIndexToRemove();
            model.removeTask(taskIndexToRemove);
        }
    }
}
