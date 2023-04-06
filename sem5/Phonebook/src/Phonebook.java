import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Phonebook {

    private List<Contact> contacts;
    private String file = "contacts";
    private ExportFile exportFile;
    private ImportFile importFile;
    private Map<String, List<String>> phonebook = new HashMap<>();

    public Phonebook(String filePath) {
        this.contacts = new ArrayList<>();
        this.exportFile = new ExportFile(filePath);
        this.importFile = new ImportFile(filePath);
    }

    public Phonebook() {

    }
    public List<Contact> getPhonebook() {
        return (List<Contact>) phonebook;
    }

    public void setPhonebook(List<Contact> phonebook) {
        this.phonebook = (Map<String, List<String>>) phonebook;
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<String> numbers = entry.getValue();
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    public void addNumber(String name, String phoneNumber) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phonebook.put(name, numbers);
        }
    }

    public void removeContact(Scanner scanner) {
        System.out.println("Введите информацию о контакте, который нужно удалить:");
        System.out.print("Имя или номер телефона: ");
        String searchQuery = scanner.nextLine();
        List<Contact> contactsToRemove = searchContacts(searchQuery);
        if (contactsToRemove.isEmpty()) {
            System.out.println("Контакт не найден.");
        } else {
            System.out.println("Найдены контакты: ");
            for (int i = 0; i < contactsToRemove.size(); i++) {
                System.out.println((i + 1) + ". " + contactsToRemove.get(i));
            }
            System.out.print("Введите номер контакта для удаления (0 для отмены): ");
            try {
                int index = Integer.parseInt(scanner.nextLine().trim()) - 1;
                if (index >= 0 && index < contactsToRemove.size()) {
                    Contact contactToRemove = contactsToRemove.get(index);
                    contacts.remove(contactToRemove);
                    System.out.println("Контакт удален: " + contactToRemove);
                } else if (index == -1) {
                    System.out.println("Удаление отменено.");
                } else {
                    System.out.println("Неверный номер контакта.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера контакта.");
            }
        }

    }

    public List<Contact> searchContacts(String searchTerm) {
        List<Contact> searchContact = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(searchTerm) || contact.getPhoneNumber().contains(searchTerm)) {
                searchContact.add(contact);
            }
        }
        if (searchContact.size() == 0) {
            System.out.println("Контактов с такими данными не найдено");
        }
        return searchContact;
    }

    public void exportContactsToXml() throws IOException {
        exportToXml(contacts, this.file);
    }
    public void exportToXml(List<Contact> contacts, String filePath) throws IOException {
        // Пока не реализовано

    }
    public void exportContactsToCsv() throws IOException {
        exportToCsv(contacts, this.file);
    }

    public void exportToCsv(List<Contact> contacts, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + ".csv"))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhoneNumber());
                bw.newLine();
            }
        }
    }

    public void importContactsFromXml() throws IOException {
        List<Contact> importedContacts = importFile.importFromXml(this.file);
        for (Contact contact : importedContacts) {
            if (!contacts.contains(contact)) {
                contacts.add(contact);
            }
        }
    }
    public void importContactsFromCsv() throws IOException {
        List<Contact> importedContacts = importFile.importFromCsv(this.file);
        for (Contact contact : importedContacts) {
            if (!contacts.contains(contact)) {
                contacts.add(contact);
            }
        }
    }
}


