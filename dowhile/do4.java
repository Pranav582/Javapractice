
import java.util.Scanner;

public class do4{
    public static void main(String[] args) {
        int no,  num , rem ,rev=0;

        System.out.println("enter an no: ");
        Scanner Sc = new Scanner(System.in);
        no  = Sc.nextInt();
        num =no;

        do { 
            rem = num%10;
            rev = rev *10 + rem;
            
        } while (num > 0);
        {
            if (num == rev){
                System.out.println( no +"is an palindrome");
            } else {
                System.out.println(no + "not an palindrome");
            }
        }
       // System.out.println(no);
    }
}