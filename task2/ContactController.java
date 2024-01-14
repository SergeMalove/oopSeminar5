package oopSeminar5.task2;

public class ContactController {
    private ContactModel model;
    private ContactView view;

    public ContactController(ContactModel model, ContactView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            view.displayContacts(model.getContacts());
            view.showMenu();
            choice = view.getUserChoice();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
            }
        } while (choice != 3);
    }

    private void addContact() {
        System.out.print("¬ведите им€ контакта: ");
        String name = view.scanner.nextLine();
        System.out.print("¬ведите адрес электронной почты контакта: ");
        String email = view.scanner.nextLine();
        Contact contact = new Contact(name, email);
        model.addContact(contact);
    }

    private void removeContact() {
        int contactNumber = view.getUserChoice() - 1;
        if (contactNumber >= 0 && contactNumber < model.getContacts().size()) {
            Contact contactToRemove = model.getContacts().get(contactNumber);
            model.removeContact(contactToRemove);
        }
    }
}
