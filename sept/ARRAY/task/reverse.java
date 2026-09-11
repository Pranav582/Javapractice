
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        //int num = 156;
        System.out.print("Enter an number : "); 
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
 

        int rem;//6,5,
        int rev = 0;

        while (num>0){//156>0 t, 15 >0 =t , 1>0 ,0>0f
            rem = num%10;//156 %10= 6, 5, 1, 
             rev = rev * 10 + rem;
             //0 *10 + 6=6
             //6 *10 + 5=65
             // 1 * 10 + 65 = 651
            num = num/10;
            //156/10 = 15
            //156/10 = 1
            // 156/10 = 0
           

        }
       // System.out.println(rev);
        if (num == rev){
            System.out.println( rev + " is an palindrome");
        } else {
            System.out.println (rev + " not an palindrome"); 
        }
    }
}