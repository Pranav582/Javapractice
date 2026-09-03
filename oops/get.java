// class code {
//     void get(){
//         System.out.println("get");
//     }
//     void set(){
//         System.out.println("set");

//     }
//     void show(){
//         System.out.println("show");
//         get();
//         set();
//         System.err.println("");

//     }
// }
// public class get{
//     public static void main(String[] args) {
//         code t1 = new code();
//         t1.show();
        
//     }
// }


class code {
   
    int b; 
    String n;


    void get (int a, String name, float marks, String add){
       b = a;
       n = name;
       System.out.println("Marks: " + marks + ", Address: " + add);

    }
    void set (){
        System.out.println( b + " " + n);
    }
     void show(int a, int b){
       int sum = a+b;

     }
       void marks(int a , int b ){
        float marks = a ;
        float marks1 = b;
       }

        
     }
     public class get{
        public static void main(String[] args) {
             code ab = new code();
             ab.get(2, 3  + "pranav" + 2 ,3 );


            
        }
     }

