package Pets;

public class Cat extends Pet implements Voice{
    public Cat(String name, int age, Gender gender, String petColor) {
        super(name, age, gender, petColor);
    }


    public Cat(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Gender gender) {
        super(name, gender);
    }

    public Cat(String name, int age, String petColor) {
        super(name, age, petColor);
    }

    @Override
    public void callReply() {
        System.out.println(getPetName() + " шипит и не подходит");
    }


    public void purr() {
        System.out.println(getPetName() + " мурлычет");
    }

    public void poop() {
        System.out.println(getPetName() + " самозабвенно гадит в тапки");
    }

    @Override
    public void askForFood(Human human) {
        System.out.println(getPetName() + " орет и просит еду у " + human.getFullName());
    }


    public static void voice() {
        System.out.println(Pet.getPetName() + " урчит и царапает диван");
    }

}