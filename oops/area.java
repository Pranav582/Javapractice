

// class Area {
//     int squareside = 25; 
//     void square ()
//     {
//         System.out.println("squre" + (squareside*squareside));

//     }
//     //int rectangle;
//     int width = 12;
//     int length = 16;
//     void rectangle ()
//     {
//         System.out.println("rectangle" + (width*length));
//     }
//      public class AreaMain {
//         public static void main(String[] args) {
//             Area ob1 = new Area();
//             Area ob2 = new Area();
//             ob1.square();
//             ob2.rectangle();
//             // Auto ob1 = new Auto();
//             // Metro ob2 = new Metro();
//             // Bus ob3 = new Bus();
//             // ob1.fare();
//             // ob2.fare();
//             // ob3.fare();
//         }
//      }

// }

class Area {
    int squareSide = 25; // Renamed variable to avoid conflict
    void square() {
        System.out.println("Square area: " + (squareSide * squareSide));
    }

    int width = 12;
    int length = 16;
    void rectangle() {
        System.out.println("Rectangle area: " + (width * length));
    }

    public static void main(String[] args) {
        Area area = new Area(); // Create an object of the Area class
        area.square(); // Call the square method
        area.rectangle(); // Call the rectangle method
    }
}
