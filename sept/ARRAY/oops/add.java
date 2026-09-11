class test1{
    int add (int a, int b){
        return a+b;
    }
    double mul(double a, double b){
        return a*b;
    }
    int mod (int a , int b ){
        return a/b;
    }
    int sub (int a ,int b){
        return a-b;
    }
    float add1(float a , float b){
        return a-b;
    }


}
public class add{
    public static void main(String[] args) {
        test1 ob = new test1(); 
        System.out.println(ob.add(3, 5));
        System.out.println(ob.mul(3, 6));
        System.out.println(ob.mod(12, 2));
        System.out.println(ob.sub(7, 2));
        System.out.println(ob.add1(7f, 2f));
        
        
    }
}