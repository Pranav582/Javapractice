// public class pattern8 {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1 || j==1){
//                     System.out.print(5);
//                 }else if(i==2 || j==2){
//                     System.out.print(4);

//                 }else if(i==3 || j==3){
//                     System.out.print(3);
//                 }else if(i==4 || j==4){
//                     System.out.print(2);

//                 }else if(i==5 || j==5){
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }
public class pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=5;s>=i;s--){
                System.out.print(s);
            }
            for(int j=1;j<i;j++){
               // System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}