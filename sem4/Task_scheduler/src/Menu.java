import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        TaskManager<Task> taskManager = new TaskManager<>();

        System.out.println("Выберите действие");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Удалить задачу");
        System.out.println("3. Просмотреть все задачи");
        System.out.println("4. Экспортировать задачи в файл");
        System.out.println("5. Импортировать задачи из файла");
        System.out.println("6. Выйти из приложения");
        System.out.println();

        int optionChoice = scanner.nextInt();
        scanner.nextLine();
        int taskID;

        switch (optionChoice){
            case 1:
                System.out.print("Введите ФИО автора задачи: ");
                String authorName = scanner.nextLine();
                System.out.print("Введите приоритет задачи (l - низкий, m - средний, h - немедленное выполнение): ");
                Priority priority = Priority.valueOf(scanner.nextLine().toLowerCase());
                System.out.print("Введите описание задачи: ");
                String description = scanner.nextLine();
                System.out.print("Введите дату и время начала выполнения задачи в формате \"dd-MM-yyyy HH:mm\" : ");
                LocalDateTime taskDateTime = LocalDateTime.parse(scanner.nextLine(), dtf);
                System.out.print("Введите дедлайн задачи в формате \"dd-MM-yyyy HH:mm\" : ");
                LocalDateTime deadlineDateTime = LocalDateTime.parse(scanner.nextLine(), dtf);
                taskManager.addTask(authorName, priority, description, taskDateTime, deadlineDateTime);
                break;
            case 2:
                System.out.println("Введите id задачи, которую нужно удалить");
                taskID = scanner.nextInt();
                if (taskManager.getTaskByID(taskID) == null) {
                    System.out.println("Задачи с таким id не существует");
                } else {
                    System.out.println("Нажмите 0 для удаления :" + taskManager.getTaskByID(taskID));
                    if (scanner.nextInt() == 0) {
                        taskManager.deleteTask(taskID);
                        System.out.println("Задача удалена.");
                    }
                }
                break;
            case 3:
                List<Task> tasks = taskManager.getAllTasks();
                if (tasks.isEmpty()) {
                    System.out.println("Задачи не найдены.");
                } else {
                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                }
                break;
            case 4:
                System.out.println("Введите путь и файл для экспорта");
//                String file = scanner.next();

                break;
            case 5:
                System.out.println("Введите путь и файл для импорта");
//                String file = scanner.next();

                break;
            case 6:
                boolean quit = true;
                break;
            default:
                System.out.println("Пожалуйста, попробуйте еще раз.");
                break;

        }
        scanner.close();
    }
}
