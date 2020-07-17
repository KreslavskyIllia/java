import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> box = new ArrayList<>();

    public void addFruit(T fruit){
        box.add(fruit);
    }

    public float getWeight() {
        float sum = 0;
        for (T f : box){
            sum += f.getFruitWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> another){
        return this.getWeight() == another.getWeight();
    }

    public void removeToBox (Box<T> newBox){
        for (T f : box) {
            newBox.addFruit(f);
        }
        box.clear();
    }
}