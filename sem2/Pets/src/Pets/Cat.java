package Pets;

import java.util.Random;

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

    @Override
    public void poop() {
        System.out.println(getPetName() + " самозабвенно гадит в тапки");
    }
    public Random random = new Random();

    @Override
    public void askForFood(Human human) {
        if (getHungry() > 50) {
            System.out.println(getPetName() + " орет и просит еду у " + human.getFullName());
        } else {
            System.out.println(getPetName() + " спит");
        }
    }


    public void voice() {
        System.out.println(getPetName() + " урчит и царапает диван");
    }

    @Override
    public void crunch() {

    }

}