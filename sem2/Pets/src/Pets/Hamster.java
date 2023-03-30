package Pets;

public class Hamster extends Pet implements Voice{
    public Hamster(String name, int age, Gender gender, String petColor) {
        super(name, age, gender, petColor);
    }


    public Hamster(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Hamster(String name) {
        super(name);
    }

    public Hamster(String name, Gender gender) {
        super(name, gender);
    }

    public Hamster(String name, int age, String petColor) {
        super(name, age, petColor);
    }

    @Override
    public void callReply() {
        System.out.println(getPetName() + " пищит и прячется");
    }


    @Override
    public void poop() {
        System.out.println(getPetName() + " аккуратно сходил в уголок");
    }

    @Override
    public void askForFood(Human human) {
        if (getHungry() > 50) {
            System.out.println(getPetName() + " молчит и шуршит. Наверное, хочет есть");
        } else {
            System.out.println(getPetName() + " спит");
        }
    }


    public void voice() {
        System.out.println(getPetName() + " пищит, хотя хомяки вообще-то молчаливые");
    }

    public void crunch() {
        System.out.println(getPetName() + " грызет вкусняшки");
    }

}