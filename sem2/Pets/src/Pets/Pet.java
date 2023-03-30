package Pets;

import java.util.Random;

public abstract class Pet {
    private String petName;
    private int petAge;
    private Gender gender;
    private String petColour;

    public Pet(String petName, int petAge, Gender gender, String petColour) {
        this.petName = petName;
        this.petAge = petAge;
        this.gender = gender;
        this.petColour = petColour;
    }
    public Pet(String petName) {
        this.petName = petName;
    }
    public Pet(String petName, int petAge, Gender gender) {
        this.petName = petName;
        this.petAge = petAge;
        this.gender = gender;
    }

    public Pet(String petName, Gender gender) {
        this.petName = petName;
        this.gender = gender;
    }

    public Pet(String petName, int petAge, String petColour) {
        this.petName = petName;
        this.petAge = petAge;
        this.petColour = petColour;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPetColour() {
        return petColour;
    }

    public void setPetColour(String petColour) {
        this.petColour = petColour;
    }

    public abstract void callReply();

    protected abstract void poop();

    public abstract void askForFood(Human human);

    public abstract void voice();

    public abstract void crunch();

//    int hunger;

    public int getHungry() {;
//        int hunger = 0;
        Random random = new Random();
        int hunger = random.nextInt(100);
        return hunger;
    }

}
