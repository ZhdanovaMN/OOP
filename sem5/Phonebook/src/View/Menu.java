package View;

import Model.Phonebook;

import java.util.Scanner;

public class Menu {
    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        System.out.println("Выберите действие");
        System.out.println("1. Создать контакт");
        System.out.println("2. Удалить контакт");
        System.out.println("3. Просмотреть все контакты");
        System.out.println("4. Экспортировать контакты в XML-файл");
        System.out.println("5. Импортировать контакты из XML-файла");
        System.out.println("6. Экспортировать контакты в CSV-файл");
        System.out.println("7. Импортировать контакты из CSV-файла");
        System.out.println("8. Найти контакт");
        System.out.println("9. Выйти из приложения");
        System.out.println();

        try{
            int optionChoice = scanner.nextInt();
            scanner.nextLine();
            int taskID;
            switch (optionChoice){
                    case 1:

                        phonebook.addNumber(scanner);
                        break;
                    case 2:
                        phonebook.removeContact(scanner);
                        break;
                    case 3:
                        phonebook.printAll();
                        break;
                    case 4:
                        phonebook.exportContactsToXml();
                        break;
                    case 5:
                        phonebook.importContactsFromXml();
                        break;
                    case 6:
                        phonebook.exportContactsToCsv();
                        break;
                    case 7:
                        phonebook.importContactsFromCsv();
                        break;
                    case 8:
                        phonebook.searchContacts(String.valueOf(scanner));
                    break;
                    case 9:
                        boolean quit = true;
                        break;
                    default:
                        System.out.println("Пожалуйста, попробуйте еще раз.");
                        break;

                }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
        scanner.close();
    }


}
