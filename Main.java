import java.util.*;

public class Main {

    public static void main(String[] args) {
        doArrayTask();
        doPhoneBookTask();
    }

    public static void doArrayTask() {
        System.out.println("Задание 1.");
        String[] words = {"apple", "peach", "apricot", "apple", "melon", "watermelon", "melon", "peach", "banana", "pineapple", "orange", "apple", "melon", "banana", "apple", "melon"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова из массива:" + set);
        for (String word : set) {
            System.out.println(String.format("Количество слов %s: %s", word, Collections.frequency(Arrays.asList(words), word)));
        }
    }

    public static void doPhoneBookTask() {
        System.out.println("Задание 2.");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", 921233617);
        phoneBook.add("Петров", 98877661);
        phoneBook.add("Васечкин", 98865443);
        phoneBook.add("Иванов", 911334557);
        phoneBook.get("Петров");
        phoneBook.get("Иванов");
    }
}
