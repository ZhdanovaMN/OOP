import java.util.ArrayList;
import java.util.Arrays;

class Wardrobe {
    private boolean isDoorOpen;
    public ArrayList<String> items = new ArrayList<>();

    public Wardrobe() {
        this.isDoorOpen = false;
        this.items = new ArrayList<>();
    }

    public boolean WardrobeOr() {
        return isDoorOpen;
    }

    public ArrayList<String> items() {
        return items;
    }

    public void openWardrobe() {
        this.isDoorOpen = true;
    }

    public void closeWardrobe() {
        this.isDoorOpen = false;
    }

    public void addItem(String itemName) {
        items.add(itemName);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public static void wardrobe() {
        Human Cheburashka = new Human("Чебурашка", Human.Gender.male);
        Wardrobe ward = new Wardrobe();
        ward.items().addAll(Arrays.asList("бальное платье", "купальник", "футболку", "кучу носков"));
        Cheburashka.openWardrobe(ward);
        Cheburashka.observe(ward);
        Cheburashka.findItemInWardrobe("балетки", ward);
        Cheburashka.findItemInWardrobe("купальник", ward);
        Cheburashka.takeItem("костюм", ward);
        Cheburashka.addItem("кимоно", ward);
        Cheburashka.closeWardrobe(ward);
        System.out.println();
    }
}