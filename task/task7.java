class cars1{
    String name;
    double price;
    String color;
    Float topSpeed;
    String segment;

    cars1(String name, double price , String color, Float topSpeed, String Segement){
        this.name= name;
        this.price=price;
        this.color=color;
        this.topSpeed=topSpeed;
        this.segment=segment;
    }
    public cars1(){
    this("creta" , 10000.0, "black", 160.2f, "Middleclass");
    }
    public void display(){
        System.out.println("Name: " + name + " color: "+ color+" topspeed: " +topSpeed+ " segment: "+ segment);
    }

    

}
public class task7{
    public static void main(String[] args) {
        cars1 a = new cars1();
        a.display();
        
    }
}

