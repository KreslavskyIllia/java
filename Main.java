import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <T> void arrayChangeElements(T[] array, int index1, int index2) {
        System.out.println("Исходный массив:" + Arrays.toString(array));
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("Измененный массив:" + Arrays.toString(array));
    }

    public static <T> void arrayToArrayList(T[] array){
        ArrayList<T> arrayList = new ArrayList<>();
        for (T a : array) {
            arrayList.add(a);
        }
        System.out.println("ArrayList: " + arrayList);
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "peach", "apricot"};
        arrayChangeElements(arr, 1, 2);
        arrayToArrayList(arr);

        // Задача 3. Фрукты в коробках

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println("Вес коробки с яблоками: " + box1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + box2.getWeight());
        System.out.println("Коробки с яблоками и апельсинами равны по весу: " + box1.compare(box2));
        Box<Apple> box3 = new Box<>();
        box3.addFruit(new Apple());
        System.out.println("Вес второй коробки с яблоками: " + box3.getWeight());
        System.out.println("Коробки с яблоками равны по весу: " + box1.compare(box3));
        box1.removeToBox(box3);
        System.out.println("Вес второй коробки с яблоками после пересыпания: " + box3.getWeight());
        System.out.println("Вес первой коробки с яблоками после пересыпания: " + box1.getWeight());
    }
}
