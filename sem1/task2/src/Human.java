public class Human {
    private String fullName;
    private Gender gender;

    public enum Gender {
        male,
        female,
    }
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


    public void openWardrobe(Wardrobe wardrobe) {
        if (!wardrobe.WardrobeOr()) {
            if (this.getGender() == Gender.male) {
                System.out.println(this.getFullName() + " открыл дверь шкафа");
            } else if (this.getGender() == Gender.female) {
                System.out.println(this.getFullName() + " открыла дверь шкафа");
            } else {
                System.out.println(this.getFullName() + " открыло дверь шкафа");
            }
            wardrobe.openWardrobe();
        } else {
            System.out.println("Дверь шкафа уже открыта");
        }
    }

    public void closeWardrobe(Wardrobe wardrobe) {
        if (wardrobe.WardrobeOr()) {
            if (this.getGender() == Gender.male) {
                System.out.println(this.getFullName() + " закрыл дверь шкафа");
            } else if (this.getGender() == Gender.female) {
                System.out.println(this.getFullName() + " закрыла дверь шкафа");
            } else {
                System.out.println(this.getFullName() + " закрыло дверь шкафа");
            }
            wardrobe.closeWardrobe();
        } else {
            System.out.println("Дверь шкафа уже закрыта");
        }
    }


    public void observe(Wardrobe wardrobe){
        if (wardrobe.WardrobeOr()) {
            if (this.getGender() == Gender.male) {
                System.out.println(this.getFullName() + " заглянул в шкаф и увидел: " + wardrobe.items() );
            } else if (this.getGender() == Gender.female) {
                System.out.println(this.getFullName() + " заглянула в шкаф и увидела: " + wardrobe.items() );
            } else {
                System.out.println(this.getFullName() + " заглянуло в шкаф и увидело: " + wardrobe.items() );
            }
        } else {
            System.out.println("Дверь шкафа все еще закрыта");
        }
    }
    public void findItemInWardrobe(String itemName, Wardrobe wardrobe) {
        if (wardrobe.WardrobeOr()) {
            if (wardrobe.items().contains(itemName)) {
                if (this.getGender() == Gender.male) {
                    System.out.println(this.getFullName() + " нашел в шкафу: " + itemName);
                } else if (this.getGender() == Gender.female) {
                    System.out.println(this.getFullName() + " нашла в шкафу: " + itemName);
                } else {
                    System.out.println(this.getFullName() + " нашло в шкафу: " + itemName);
                }
            } else {
                System.out.println(itemName + " не в шкафу");
            }
        } else {
            System.out.println("Дверь шкафа все еще закрыта");
        }
    }

    public void addItem(String itemName, Wardrobe wardrobe) {
        if (wardrobe.WardrobeOr()) {
            if (this.getGender() == Gender.male) {
                System.out.println("Положил в шкаф: " + itemName);
            } else if (this.getGender() == Gender.female) {
                System.out.println("Положила в шкаф: " + itemName);
            } else {
                System.out.println("Положило в шкаф: " + itemName);
            }
            wardrobe.addItem(itemName);
        } else {
            System.out.println("Дверь шкафа все еще закрыта");
        }
    }

    public void takeItem(String itemName, Wardrobe wardrobe) {
        if (wardrobe.WardrobeOr()) {
            if (this.getGender() == Gender.male) {
                System.out.println("Взял из шкафа: " + itemName);
            } else if (this.getGender() == Gender.female) {
                System.out.println("Взяла из шкафа: " + itemName);
            } else {
                System.out.println("Взяло из шкафа: " + itemName);
            }
            wardrobe.removeItem(itemName);
        } else {
            System.out.println("Дверь шкафа все еще закрыта");
        }
    }

}
