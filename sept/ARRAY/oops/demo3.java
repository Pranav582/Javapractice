class  calci{
    int a = 12;
    int b = 13;

}
public class demo3{
    public static void main(String[] args) {
        new calci();
        System.out.println(new calci().a);
        System.out.println(new calci().b);
        System.out.println((new calci().a)+ (new calci().b));
    }
}