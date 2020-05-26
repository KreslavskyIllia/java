public class Main {

    public static void main(String[] args) {
        doEmployeeTask();
    }

    static void doEmployeeTask(){
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван", "Директор", "ivan1970@mail.ru", "89213425471",150000, 50);
        employeeArray[1] = new Employee("Петров Петр", "Менеджер по продажам", "petr1990@mail.ru", "89219567329", 50000, 30);
        employeeArray[2] = new Employee("Ульянова Ульяна", "Бухгалтер", "uliana1945@mail.ru", "89219738833", 50000, 75);
        employeeArray[3] = new Employee("Федоров Федор", "Дизайнер", "fedr1985@mail.ru", "89116548921", 35000, 35);
        employeeArray[4] = new Employee("Васильев Василий", "Верстальщик", "vasily1975@mail.ru", "89112054996", 32000, 45);
        for (int i = 0; i < employeeArray.length; i++){
            employeeArray[i].employeeOlder40Info();
        }
    }

}
