// class test4
// {
//     test4()
//     {
//         System.out.println("constructor1");
//     }
//     test4(int p){
//         System.out.println("constructor 2");
//     }
//     test4(String str) {
//     System.out.println("constructor 3 ");
// }
// }
// public class constructor{
//     public static void main(String[] args) {
//         test4 t1 = new test4(2);
        
//         test4 t2 = new test4(); 
//         test4 t3 = new test4(); 
        
//     }
// }

// class test1 {
//     int n;
//     String name;
//     float marks;
//     String addr;

//     test1(int n, String name, float marks, String addr) {
//         this.n = n;
//         this.name = name;
//         this.marks = marks;
//         this.addr = addr;
//     }
//     void show()
//     {
//         System.out.println("Name: " + name + ", Marks: " + marks + ", Address: " + addr);
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//         test1 s1 = new test1(1, "pranav", 85, "pune");
//         test1 s2 = new test1(2, "om", 90, "Mumbai");

      
//          s1.show();
//          s2.show();
        
//     }
// } 

// class test1 {
//     //our container
//     String user;
//     String password;

//     test1(String user, String password) //took data from object container
//     {
//         //assign from object to container(variable) usint this
//         this.user = user;
//         this.password = password;
//     }

//     public test1() 
//     {
//         this("Admin","123");//call that constructor who has data
//         //After getting data it will print smoothly
//         System.out.println(user +" " + password);
//     }
    
// }
// public class constructor{
//     public static void main(String[] args) {
//         test1 t1= new test1();
//         //user will always call default constructor
//     }
// }


// class emp
// {
//     String employeename;
//     String employeeaadd;
//     int salary;
//     float exp;

//     emp(String employeename, String employeeaadd, int salary, float exp) {
//         this.employeename = employeename;
//         this.employeeaadd = employeeaadd;
//         this.salary = salary;
//         this.exp = exp;
//     }

//     public emp() {
//         this("sam", "Pune", 670000, 5.6f); 
//     }

//     void display() {
//         System.out.println("Employee Name: " + employeename + ", Address: " + employeeaadd + ", Salary: " + salary + ", Experience: " + exp + " years");
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
        

//         emp e2 = new emp();
//         e2.display();
//     }
    
// }

//inheritance
// class vehicle{
//     public void start() {
//         System.out.println("Vehicle is starting");
//     }
// }
// class car extends vehicle{
//     public void driving() {
//         System.out.println("driving car");
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//         car c1 = new car();
//         c1.start();
//         c1.driving();
//     }
// }


//inheritance

// class animal {
//     public void eat()
// {
//     System.out.println("Animal can eat diff type of food");

// }

// public void sleep(){
//     System.out.println("sleep is important for animal");
// }
// }
// class dog extends animal{
//     public void bark(){
//         System.out.println("dog can bark");
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//         dog d1 = new dog();
//         d1.eat();
//         d1.sleep();
//         d1.bark();
//     }
// }


// //multilevel inheritance
// class employee {
//     public void work()
// {
//     System.out.println("Employee can work in different fields");
// }
// }
// class manager extends employee{
//     public void manage(){
//         System.out.println("Manager can manage the team");
//     }
// }
// class seniorManager extends manager{
//     public void lead(){
//         System.out.println("Senior Manager can lead the team");
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//         seniorManager sm1 = new seniorManager();
//         sm1.work();
//         sm1.manage();
//         sm1.lead();
//     }
// }


abstract class test {
    public abstract void show();
    public void display(){
        System.out.println("this is simple method from abstrect class");
    }
}
class example extends test
{
    public void show(){
        System.out.println("this is soow methid from parent class");
    }
}
public class constructor{
    public static void main(String[] args) {
        example e = new example();
        e.display();
        e.show();
    }
}