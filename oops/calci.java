//import java.util.Scanner;
import java.util.Scanner;

class ArithimeticOperations
{
    void add(int num1 , int num2)
    {
        System.out.println("Addition: "+( num1+num2));
    }
    void sub(int num1 , int num2)
    {
        System.out.println("Substraction: "+( num1-num2));
    }
    void mul(int num1 , int num2)
    {
        System.out.println("Multiplication: "+( num1*num2));
    }
    void div(int num1 , int num2)
    {
        System.out.println("Division: "+( num1/num2));
    }
    
}
public class calci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two nos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        ArithimeticOperations ob =new ArithimeticOperations();
        ob.add(num1,num2);
        ob.sub(num1,num2);
        ob.mul(num1,num2);
        ob.div(num1,num2);
    }
}

