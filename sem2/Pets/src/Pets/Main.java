package Pets;

public class Main {
    public static void main(String[] args) {
        pet();
    }
    public static void pet() {
        Human Cheburashka = new Human("Чебурашка", Gender.male);
        Cat Maiq = new Cat("М'Айк Лжец", 10, Gender.male, "grey");
        Cheburashka.feed(Maiq);
        Cheburashka.stroke(Maiq);
        Cheburashka.call(Maiq);
        Cheburashka.talk(Maiq);
//        Cat.poop();
        Cheburashka.throwValenok(Maiq);
//        Cat.askForFood(Cheburashka);
        Cheburashka.feed(Maiq);
        Cat.voice();
        Cheburashka.throwValenok(Maiq);
    }
}