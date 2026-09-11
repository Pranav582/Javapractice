class Employee{
    int age;
    String name;
    float height;
}

public class task1{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.age = 31;
        emp.name="rakesh";
        emp.height = 6.11f;

        System.out.println("Employee details");
        System.out.println("emp age: " + emp.age);
        System.out.println("emp name: " + emp.name);
        System.out.println("emp height: " + emp.height);
    }
}