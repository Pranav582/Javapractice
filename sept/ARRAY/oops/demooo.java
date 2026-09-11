// // class A {
// //     void get() {
// //         System.out.println("get");
// //     }

// //     class B {
// //         void show() {
// //             System.out.println("set");
// //         }
// //     }

// //     class C {
// //         void display() {
// //             System.out.println("show");
// //         }
// //     }
// // }

// // public class overridding {
// //     public static void main(String[] args) {
// //         A a1 = new A();
// //         a1.get();

// //         A.B b1 = a1.new B();
// //         b1.show();

// //         A.C c1 = a1.new C();
// //         c1.display();
// //     }
// // }

// // interface demo12{
// //     void get();

// // } 
// // class demo13 implements demo12{
// //     public void get(){
// //         System.out.println("get");
// //     }
// // }
// // public class demooo{
// //     public static void main(String[] args) {
// //         demo13 d1= new demo13();
// //         d1.get(){
// //             void get()
// //         }

// //     }
// // }

// // interface demo12{
// //     void get();
// //      void show();

// // } 
// // // class demo13 implements demo12{
// // //     public void get(){
// // //         //System.out.println("get");
// // //     }
// // //     public void show(){
// // //         //System.out.println("get");
// // //     }
    
// // // }
// // public class demooo{
// //     public static void main(String[] args) {
// //         demo13 d1= new demo13()
// //        {
// //             public void get()
// //             {
// //                 System.out.println("get");
// //             }
// //             public void set(){
// //                 System.out.println("show");
// //             }

// //         };
// //          d1.get();
// //          d1.show();


// //     }
// // }


// // @FunctionalInterface
// // //if interface have only one method it will called that interface as @functional interface
// // interface demo{
// //     void get();


// // }
// // public class demooo{
// //     public static void main(String[] args) {
// //         demo d1 = new demo() {
// //         public void get(){
// //             System.out.println("get");
// //         }
// //         };
// //         d1.get();
        
// //     }
// // }

// // @FunctionalInterface

// // interface Inter1 {
// // 	void get();
// // }

// // interface Inter2 {
// // 	void set();
// // }

// // interface Inter3 {
// // 	void show();
// // }

// // class Inter123 implements Inter1, Inter2, Inter3 {

// // 	@Override
// // 	public void show() {
// // 		System.out.println("show data");
// // 	}

// // 	@Override
// // 	public void set() {
// // 		System.out.println("set the data");

// // 	}

// // 	@Override
// // 	public void get() {
// // 		System.out.println("get the data");

// // 	}
// // 	public static void main(String [] args) {
// // 		Inter123 ob = new Inter123();
// // 		ob.get();
// // 		ob.set();
// // 		ob.show();

// // 	}

// // }

// // interface one {
// // 	void get();
// // }

// // interface two {
// // 	void get1();
// // }

// // class onetwo implements one, two {
// // 	public void get() {
// // 		System.out.println("abc");
		
// // 	}
// // 	public void get1() {
// // 		System.out.println("abc");
// // 	}

// // 	public static void main(String[] args) {
// // 		onetwo s1 = new onetwo();
// // 		s1.get();
// // 		s1.get1();
		

// // 	}

// // }
// class A1
// {
//     A1(int n){
//         System.out.println("A1 = " + n);
//     }
//     class A2 extends A1
// {

//         public A2() {
//             super(2);
//             System.out.println("A2");
//         }
    
//     }
// }
// public class demooo {
//     public static void main(String[] args) {
//         A2 a1 = new A2();
//     }
// }
// class A1{
//     A1(int n){
//     System.out.println("A1="+n);
//     }
//     A1(String name){
//         this(2);
//         System.out.println("Name="+name);
//     }
// }
// class A2 extends A1{
//     A2(){
//         //super(2);
//         super("Aditya");

//         System.out.println("A2");
//     }

// }
// public class OOps65 {
//     public static void main(String[] args) {
//         A2 ob=new A2();

        
//     }
    
// }

// this cons //super cons
class A1{
    A1(int n){
    System.out.println("A1="+n);
    }
    A1(String name){
        this(2);
        System.out.println("Name="+name);
    }
}
class A2 extends A1{
    A2(){
        //super(2);
        super("pranav");

        System.out.println("A2");
    }

}
public class demooo {
    public static void main(String[] args) {
        A2 ob=new A2();

        
    }
    
}