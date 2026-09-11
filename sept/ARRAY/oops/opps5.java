// class Test
// {
//     //need of object we can call method()
//     //if we call static method without object that will also work
//     //just return the warning
// static void get()
// {
//     System.out.println("get");
// }
// //need mandatiorly object
// {
//     System.out.println("show");
// }


// }
// public class opps5{
// public static void main (String[] args){
//     test t1 = new test();
//     test.get();
//     test.show();
// }
// }

// class TestClass {
//       void get(int a) {
//         System.out.println("first");

//       }
//       void get( ){
//         System.out.println("second");
//       }

//       void get(char p){
//         System.out.println("third");
//       }

// }
// public class opps5{
//     public static void main(String[] args) {
//         TestClass  ob = new TestClass();
//         ob.get(2);
//         ob.get();
//         ob.get('p');


//     }
// }

//static method overloading

class TestClass {
     static void get(int a) {
        System.out.println("one");

      }
     static void get( ){
        System.out.println("two");
      }


}
public class opps5{
    public static void main(String[] args) {
       
        TestClass.get();
        TestClass.get(1);
        

    }
}