import java.util.*;

public class prac {

    public static void main(String[] args) {
        // int seconds = 5000;

        //   // Calculate hours
        // int hours = seconds / 3600;

        // // Remaining seconds after removing hours
        // int remainingSeconds = seconds % 3600;

        // // Calculate minutes
        // int minutes = remainingSeconds / 60;

        // // Remaining seconds after removing minutes
        // int second = seconds % 60;

        // // Display the result
        // System.out.print("Total Seconds : " + seconds);
        // System.out.print("Hours         : " + hours);
        // System.out.print("Minutes       : " + minutes);
        // System.out.print("Seconds       : " + second);
    //   int salary = 50000;
    // //   //int num1 = 20;
    // //     System.out.println(num==num1);
    // //     System.out.println(num>num1);

    //     if( salary>=5000){
    //         System.out.println("can buy bike");

    //     } else {
    //         System.out.println("cannot buy bike");
    //     }
       

    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     //int age = 18;
    // //   //int num1 = 20;
    // //     System.out.println(num==num1);
    // //     System.out.println(num>num1);

    //     if( age>=18){
    //         System.out.println("eligible for vote");

    //     } else {
    //         System.out.println("not-eligible for vote");
    //     }
       
        
 Scanner sc = new Scanner (System.in);
 System.out.println("enter percentage");
    boolean gap = false;

    float per = sc.nextFloat();
    String skill = sc.next();


    if ((gap = false || per>60 && skill == "java")){
        System.out.println("you are eligible to apply");
    } else {
        System.out.println("you are not eligible to apply");
    }
        

    }
}