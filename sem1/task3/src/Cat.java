import java.util.Random;
public class Cat {
    private static String petName;
    private int petAge;
    private Human.Gender gender;
    private String petColour;
    private Human human;

    public Cat(String petName, int petAge, Human.Gender gender, String petColour) {
        this.petName = petName;
        this.petAge = petAge;
        this.gender = gender;
        this.petColour = petColour;
    }
    public Cat(String petName) {
        this.petName = petName;
    }
    public Cat(String petName, int petAge, Human.Gender gender) {
        this.petName = petName;
        this.petAge = petAge;
        this.gender = gender;
    }

    public Cat(String petName, Human.Gender gender) {
        this.petName = petName;
        this.gender = gender;
    }

    public Cat(String petName, int petAge, String petColour) {
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

    public Human.Gender getGender() {
        return gender;
    }

    public void setGender(Human.Gender gender) {
        this.gender = gender;
    }

    public String getPetColour() {
        return petColour;
    }

    public void setPetColour(String petColour) {
        this.petColour = petColour;
    }

    public void callReply() {
        System.out.println(petName + " шипит и не подходит");
    }

    public void purr() {
        System.out.println(petName + " мурлычет");
    }

    public static void poop() {
        System.out.println(petName + " самозабвенно гадит в тапки");
    }
    public static void askForFood(Human human) {
        System.out.println(petName + " орет и просит еду у " + human.getFullName());
    }

    public static void voice() {
        System.out.println(petName + " урчит и царапает диван");
    }

}