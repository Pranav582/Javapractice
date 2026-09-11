class employee {
   int eid = 23;
}
class student
{
 int rollno = 37;
 //String a1 = hello;
}

public class demo{
    public static void main(String[] args) {
        String s1 = new String("pranav");
        demo d1 = new demo();
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(d1));
        demo d2 = new demo();
        String s2 = new String("sagne");
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(d2));
    }
}