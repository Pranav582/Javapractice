import java.util.Scanner;
public class dowhile6 {
    public static void main(String[] args) {
        //bal
        //atm
        //1.withdraw,2.deposite,3.check bal,4.exit
        int bal = 500000;
        int choice ;
        int withdrawmoney;
        int accbal;
        Scanner sc = new Scanner(System.in);

        do {
        System.out.println("-----SBI ATM------");
        System.out.println("1. WITHDRAW MONEY");
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK ACCOUNTBALANCE");
        System.out.println("4. EXIT");

        System.out.println("Enter the option");
        choice = sc.nextInt();

if (choice >= 1 && choice <= 3) {
    System.out.println("");

switch (choice) {
    case 1: 
        System.out.println("Enter amount to withdraw:");
        withdrawmoney = sc.nextInt();
        if (withdrawmoney <= bal) {
            bal = bal - withdrawmoney;
            System.out.println("Withdrawal successful. Remaining balance: " + bal);
        } else {
            System.out.println("Insufficient balance.");
        }
        break;
    case 2:
        System.out.println("Enter amount to deposit:");
        int deposit = sc.nextInt();
        bal = bal + deposit;
        System.out.println("Deposit successful. New balance: " + bal);
        break;
    case 3:
        System.out.println("Your account balance is: " + bal);
        break;
    case 4:
        System.out.println("Exiting. Thank you for using SBI ATM.");
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
}
}
         } while (choice != 4);
   System.out.println("exiting"); }
} 