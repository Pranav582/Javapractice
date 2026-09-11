
//     public abstract void show();

//     public void display() {
//         System.out.println("this is simple method from abstract class");
//     }
// }

// class Example extends AbstractTest {
//     @Override
//     public void show() {
//         System.out.println("this is show method from parent class");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         Example e = new Example();
//         e.display();
//         e.show();
//     }
// }

// abstract class bankacc{
// public abstract void show();
// void display() {
// 	System.out.println("this is show methode from parent class");
// }
// }

// class example extends bankacc{
	
// 	public void show() {
// 		System.out.println("this show is from parent class");
// 	}
// }
		


// public class abstraction {

// 	public static void main(String[] args) {
// 		bankacc e1 = new example();
// 		e1.display();
// 		e1.show();
		

// 	}

// }
// abstract class payment {
//     public payment() {
//         System.out.println("this is super class constructor");
//     }

//     public abstract void pay();
// }

// class googlepay extends payment {
//     public googlepay() {
//         super();
//         System.out.println("this is child class constructor");
//     }

    
//     public void pay() {
//         System.out.println("Payment processed");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         payment p = new googlepay();
//         p.pay();
//     }
// }


// interface remote
// {
//     public void turnoff();
//     public void turnon();
// }
// class tv implements remote
// { 
    
//     public void turnon(){
//         System.out.println("tv is turned on");
//     }

   
//     public void turnoff(){
//         System.out.println("tv is turned off");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         remote remoteControl = new tv();
//         remoteControl.turnon();
//         remoteControl.turnoff();
//     }
// }

// interface printable {
//     void print();
// }

// interface Showable {
//     void show();
// }

// class document implements printable, Showable {
//     public void print() {
//         System.out.println("print document");
//     }

//     public void show() {
//         System.out.println("show document");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         document d = new document();
//         d.print();
//         d.show();
//     }
// }

// interface BankAcc
// {
//     default void savingacc()
//     {
//         System.out.println("This is my saving acc...");
//     }
//     class SBIbankaccount implements BankAcc
//     {
//         public void show()
//         {
//             System.out.println("Welcome to SBI Bank..");
//         }
//     }
// }
// public class abstraction{
//     public static void main(String[] args) {
//         BankAcc.SBIbankaccount sbi = new BankAcc.SBIbankaccount();
//         sbi.savingacc();
//         sbi.show();

//     }
// }
// XOOOO
// OXOOO
// OOXOO
// OOOXO
// OOOOX
public class abstraction 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int irange = 5;
		int jrange = 5;
		myCode(irange, jrange);
	}
	//EndOfMainMethod

	public static void myCode(int irange, int jrange) 
	{
		for (int i = 0; i < irange; i++) 
		{
			for (int j = 0; j < jrange; j++) 
			{
				if (i == j) 
				{
					System.out.print("X");
				} 
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
