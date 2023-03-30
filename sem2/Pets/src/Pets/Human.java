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


    public void feed(Pet pet) {
        System.out.println(fullName + " кормит " + pet.getPetName());
        System.out.println(pet.getPetName() + " теперь сыт");
//        cat.purr();
    }

    public void stroke(Pet pet) {
        System.out.println(fullName + " гладит " + pet.getPetName());
        System.out.println(pet.getPetName() + " подставляет пузико");
    }

    public void call(Pet cat) {
        System.out.println(fullName + " зовет " + cat.getPetName() + " кыс-кыс-кыс");
        cat.callReply();
    }

    public void talk(Pet pet) {
        System.out.println(fullName + " рассказывает " + pet.getPetName() + " историю своей жизни");
        pet.callReply();
    }
    public void throwValenok(Pet pet) {
        System.out.println(fullName + " кидает в " + pet.getPetName() + " валенком");
    }

}
