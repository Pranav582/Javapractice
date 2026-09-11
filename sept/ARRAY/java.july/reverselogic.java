import java.util.*;

public class reverselogic {
    public static void main(String[] args) {
        //int num1 = 12345;
        
        // System.out.println(num1%10);
        // int rem = (num1 / 10); 
        // //System.out.println(rem);
        // System.out.println(rem%10);
        // int rem1 = (rem/10);
        // System.out.println(rem1%10);
        // int rem2 = (rem1/10);
        // System.out.println(rem2%10);
        // int rem3 = (rem2/10);
        // System.out.println(rem3%10);

        // int num =2345;

        // System.out.println(num%10);
        // num = (num/10);
        // System.out.println(num%10);
        // num = (num/10);
        // System.out.println(num%10);
        // num = (num/10);
        // System.out.println(num%10);

        // int days = 300;
        // days = days/365;

        // System.out.println(days%10);
        // days = days/10;
        // System.out.println(" month " + days+ " rem " + days/ 30);

    //     int days = 365;
  
    //     month = days/365;
    //  int months = days / 30;
    //  int remainingDays = days % 30;
     
    //  System.out.println("Months: " + months + remainingDays + " ");

            // day to year
            // int days=400;
            // int year=days/365;
            // System.out.println(year+"."+days%365);
            // //  //day to week 
            //  int days1=150;
            //  int week=days1/7;
            //  System.out.println(week);
    
            //  // day to month
            //   int day=350;
            //   int month=day/30;
            //   System.out.println(month);
    
            
    // int days = 750;
    // int year = days/365;
    // System.out.println( year +" ." +days%365);
    
    //days in year
    // int days = 900;
    // int year = days/365;
    // System.out.println( year +"." + days%365);
    //months in year
    // int days = 365;
    // int months = days/30;
    // System.out.println( months +"." + days%30);

    // //days to month
    // int days = 500;
    // int month = days/30;
    // System.out.println(month+ "." + days%30);



// //days in year
// int days = 600;
// int year = days/365;
// System.out.println(year+ "." + days%365);
// //months in year
// int month = days/30;
// System.out.println(month + "." + days%30);
// //weeks in year
// int weeks = days / 7 ;
// System.out.println(weeks + "." + days%7);



// int days = 999;

// System.out.println("days in a year");
// //days in year
// int year = days/365;
// System.out.println(year+"."+ days%365); 

// //months in year
// System.out.println("months in year");
// int months = days / 30; 
// System.out.println( months+"."+days%30);

// //weeks in year

// System.out.println("weeks in year");
// int week = days/7; 
// System.out.println(week+"."+days%7);

//year
    //  Scanner sc = new Scanner(System.in);
    //  //04System.out.println("Enter ");
    // int days = sc.nextInt();
    // int year = days/365;
    // System.out.println("year" + year);
    // int rem = days%365;
    // System.out.println("rem" + rem);

    //  //month

    //  int month = year/30;
    //  System.out.println("month" + year);
    //  int rem1 = rem%30;
    //  System.out.println("rem2"+ rem1);
     
    //  //days
    //  int week = rem1 /7;
    //  System.out.println("week" + week);
    //  int rem2 = rem1%30;
    //  System.out.println("rem" + rem2);
//&& if there is true true true then ans will be 1 
    
// System.out.println(4&5);
 
// // 0 1 0 0
// // 0 1 0 1
// // 0 1 0 0 


// //if here | false false the there will be false means 0
//     System.out.println(3|6);

//     //0 0 1 1
//     //0 1 0 1
//     //0 1 1 1
      

// System.out.println(8&2|4);

// // 1 0 0 0
// // 0 0 1 0
// // 0 0 0 0
// // 0 1 0 0
// // 0 1 0 0


// System.out.println(7&2*5|1);

// //  0 1 1 1
// //  0 0 1 0
// //  0 0 1 0 

// //  1 0 1 0
// //  0 0 0 1
// //  1 0 0 0


// System.out.println(4*12&2|5);

// // 1 1 0 0 0 0
// // 0 0 0 0 1 0

// // 0 0 0 0 0 0
// // 0 0 0 1 0 1
// // 0 0 0 1 0 1

//System.out.println(4^6);

//t f t
//f t t
 //0 1 0 0
// 0 1 1 0
// 0 0 1 0
//swapping using 3rd variable

// int a = 4;
// int b = 8;
// int temp;
// System.out.println(a+ " " + b);

// temp = a;
// a = b;
// b = temp;

// System.out.println(a +" " + b);
// System.out.println(a);
// System.out.println(b);


//  int a = 4;
// int b = 8;
// System.out.println( a +" " + b);

//  a = a + b;//15
//  b = a - b;//6
//  a = a - b;//9

//  System.out.println( a +" " + b);

// a = a*b;// 6 * 9 = 54
// b = a/b;//54 / 6 =9
// a  = a /b;//6
// System.out.println( a +" " + b);


// a = a ^b;
// b = a^ b;
// a = a ^ b;
// System.out.println( a +" " +b); 



//int num = -6;7
System.out.println("enter the no");
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();


if (num >0){
    System.out.println("positive no");
   if (num%2==0) 
   {
    System.out.println("even");
   }
    // else 
    // {
    //     System.out.println("odd");
    // }

    
}
 else  if 
 

 (num<0 )   
System.out.println("negative");
else {
    System.out.println("zero");
}

//System.out.println(".()");



    }
}