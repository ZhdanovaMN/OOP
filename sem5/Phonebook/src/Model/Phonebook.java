package Model;

import View.Menu;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.*;

public class Phonebook implements ContactAccess {

    private List<Contact> contacts;
    private String file = "contacts";
    private ExportFileToFormat exportFile;
    private ImportFileFromFormat importFile;
    private Map<String, List<String>> phonebook = new HashMap<>();

    public Phonebook(String filePath) {
        this.contacts = new ArrayList<>();
        this.exportFile = new ExportFileToFormat(filePath);
        this.importFile = new ImportFileFromFormat(filePath);
    }

    public Phonebook() {

    }

    public List<Contact> getPhonebook() {
        return (List<Contact>) phonebook;
    }

    public void setPhonebook(List<Contact> phonebook) {
        this.phonebook = (Map<String, List<String>>) phonebook;
    }


    @Override
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

    @Override
    public void addNumber(Scanner scanner) {
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phonebook.put(name, numbers);
        }
        System.out.println("Контакт добавлен");
    }

    @Override
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

    @Override
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

    @Override
    public void exportContactsToXml() throws IOException, XMLStreamException {
        exportFile.exportToXml(contacts, this.file);
    }

    @Override
    public void exportContactsToCsv() throws IOException {
        exportFile.exportToCsv(contacts, this.file);
    }

    @Override
    public void importContactsFromXml() throws IOException, XMLStreamException {
        List<Contact> importedContacts = importFile.importFromXml(this.file);
        for (Contact contact : importedContacts) {
            if (!contacts.contains(contact)) {
                contacts.add(contact);
            }
        }
    }

    @Override
    public void importContactsFromCsv() throws IOException {
        List<Contact> importedContacts = importFile.importFromCsv(this.file);
        for (Contact contact : importedContacts) {
            if (!contacts.contains(contact)) {
                contacts.add(contact);
            }
        }
    }

}


