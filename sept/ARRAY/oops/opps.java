
class Auto{
    int fare = 100;
        void fare ()
        {
            System.out.println("auto: " + fare) ;
    }
}
class Metro{
    int fare = 20;
        void fare ()
        {
            System.out.println("metro: " + fare) ;
    }
}
class Bus{
    int fare = 40;
        void fare ()
        {
            System.out.println("bus: " + fare) ;
    }
}
public class opps{
    public static void main(String[] args) {
        
        Auto ob1 = new Auto();
        Metro ob2 = new Metro();
        Bus ob3 = new Bus();
        ob1.fare();
        ob2.fare();
        ob3.fare();
    }
}