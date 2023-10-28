import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {

    ArrayList<T> fruits = new ArrayList<>();
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        else {
        return fruits.getFirst().getWeight() * fruits.size();
        }
    }

    public void pourFromBox(Box<T> box) {
//        for (T fruit: fruits) {
//            box.addFruit(fruit);
//        }
//        fruits.clear();
        for (int i = fruits.size()-1; i >= 0; i--) {
            box.addFruit(fruits.get(i));
            fruits.remove(i);

        }
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }


    public void infoBox() {
        if (fruits.isEmpty()) {
            System.out.println("Коробка пуста");
        }
        else {
        System.out.printf("В коробке %d %s; вес коробки %.2f усл.ед.\n", fruits.size(), fruits.getFirst(), getWeight());
        }

    }
}
