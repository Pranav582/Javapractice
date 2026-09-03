
import java.util.Scanner;

public  class do2{
    public static void main(String[] args) {
        int sum = 0, rem,no;
        Scanner Sc = new Scanner(System.in);
            System.out.println("emter the no to cxalculate digits");
            no = Sc.nextInt();
            do{
                rem= no%10;
                sum= sum+rem;
                no = no/10;
            } while(no>0);

            System.out.println("Sum of digits are: " + sum);
    }
}