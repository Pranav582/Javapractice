// import java.util.*;
// public class dowhile5 {
//     public static void main(String[] args) {
//         //addition //sub//mul//div//exit
//         //if 1 to 4 do task using scanner
//         //switch cases 123 add sub mul
//         //exit

//     int num1 ,num2;
//     double res = 0.0;
//     int choices = 0;
  
//     Scanner sc = new Scanner(System.in);
//    do {
//     System.out.println("select options from menu");
//     System.out.println("Addition: ");
//     System.out.println("Subtraction: ");
//     System.out.println("Multiplication: ");
//     System.out.println("Division: ");
//     System.out.println("Exit: ");
//     System.out.println(" Enter two numbers: ");
//      
//if 
//(choices >= 1 && choices <= 4) { 
//     num1 = sc.nextInt();
//     num2 = sc.nextInt();


//     switch (choices){
//         case 1:res =num1 + num2;
//         System.out.println("The addition of two nos are: " + res);
//         break;
//         case 2: res = num1 -num2;
//         break;
//         case 3 : res = num1*num2;
//         break;
//         case 4:if (num2 !=0)
//          {
//             res = num1/num2;
//             System.out.println(("The division of two nos are: ") +  res );
//          }else{
//             System.out.println("The no is not div by zero");
//          }
//          break ;
//          case 5:System.out.println("Exit");
//          break;

//          default:  System.out.println("please enter valid choice");


//     }
// }
//  } while(choices!=5);
//     System.out.println("Loop is ended");

//     }


//     }


import java.util.Scanner;

public class dowhile5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choices;
        int num1, num2, res;

        do {
            System.out.println("Select options from menu:");
           
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter the no: ");
           // choices = sc.nextInt();
            choices = sc.nextInt();

            if (choices >= 1 && choices <= 4) { 
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                switch (choices) {
                    case 1:
                        res = num1 + num2;
                        System.out.println("The addition of two numbers is: " + res);
                        break;
                    case 2:
                        res = num1 - num2;
                        System.out.println("The subtraction of two numbers is: " + res);
                        break;
                    case 3:
                        res = num1 * num2;
                        System.out.println("The multiplication of two numbers is: " + res);
                        break;
                    case 4:
                        if (num2 != 0) {
                            res = num1 / num2;
                            System.out.println("The division of two numbers is: " + res);
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choices != 5) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Please enter a valid choice.");
            }
        } while (choices != 5); 
        System.out.println("EXITT...");

        
    }
}