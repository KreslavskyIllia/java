public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo(){
        System.out.println(name);
        System.out.println("Должность: " + position + ", email: " + email + ", телефон: " + phone + ", зарплата: " + salary + ", возраст: " + age + ".");
    }

    public void employeeOlder40Info(){
        while(age > 40)
        {
            employeeInfo();
            break;
        }
    }
}
