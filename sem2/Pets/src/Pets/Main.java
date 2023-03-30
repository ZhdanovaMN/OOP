package Pets;

public class Main {
    public static void main(String[] args) {
//        pet();
//    }
//    public static void pet() {
        Human Cheburashka = new Human("Чебурашка", Gender.male);
        Pet Maiq = new Cat("М'Айк Лжец", 10, Gender.male, "grey");
        Pet Hero = new Hamster("Герой", 1, Gender.male, "brown");
        Cheburashka.feed(Maiq);
        Cheburashka.feed(Hero);
        Cheburashka.stroke(Maiq);
        Cheburashka.call(Maiq);
        Cheburashka.call(Hero);
        Cheburashka.talk(Maiq);
        Maiq.poop();
        Cheburashka.throwValenok(Maiq);
        Maiq.askForFood(Cheburashka);
        Hero.askForFood(Cheburashka);
        Cheburashka.feed(Maiq);
        Maiq.voice();
        Cheburashka.throwValenok(Maiq);
        Hero.crunch();
    }
}