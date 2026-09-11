class Calci {
   int add (int a, int b) {
        return a + b;

    }
    float sub (int a , int b){
        return a-b;
    }
    float mod (int a, int b){
        return a/b;
    }
    
}
public class task2{
    public static void main(String[] args) {
        Calci nm = new Calci();
        int x=nm.add(8, 99);
       float y = nm.mod(88, 5);
       float z= nm.sub(89, 78);
        System.out.println("addition: " + x);
        System.out.println("division: " + y);
        System.out.println("subtraction: " + z);
    }
}