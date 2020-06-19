import java.util.*;

public class PhoneBook {

    public static HashMap<String, List<Integer>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public static void add(String name, Integer phone) {
        if (phoneBook.containsKey(name)) {
            List<Integer> phones = phoneBook.get(name);
            if (!phoneBook.containsValue(phone)) {
                phones.add(phone);
                System.out.println(String.format("В телефонный справочник к имени %s добавлен номер %s", name, phone));
            }
        } else {
            phoneBook.put(name, new ArrayList<>(Arrays.asList(phone)));
            System.out.println(String.format("В телефонный справочник добавлена запись: %s %s", name, phone));
        }
    }

    public static void get(String name) {
        System.out.println(String.format("На имя %s записаны номера: %s", name, phoneBook.get(name)));
    }
}

