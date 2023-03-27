package Pets;

public class Human {
    private String fullName;
    private Gender gender;

    public Human(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                '}';
    }


    public void feed(Cat cat) {
        System.out.println(fullName + " кормит " + cat.getPetName());
        System.out.println(cat.getPetName() + " теперь сыт");
        cat.purr();
    }

    public void stroke(Cat cat) {
        System.out.println(fullName + " гладит " + cat.getPetName());
        System.out.println(cat.getPetName() + " подставляет пузико");
    }

    public void call(Cat cat) {
        System.out.println(fullName + " зовет " + cat.getPetName() + " кыс-кыс-кыс");
        cat.callReply();
    }

    public void talk(Cat cat) {
        System.out.println(fullName + " рассказывает " + cat.getPetName() + " историю своей жизни");
        cat.callReply();
    }
    public void throwValenok(Cat cat) {
        System.out.println(fullName + " кидает в " + cat.getPetName() + " валенком");
    }

}
