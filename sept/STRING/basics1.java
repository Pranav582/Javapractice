public class basics1 {
    public static void main(String[] args) {
        String firstName = "Pranav";
        String lastName = "sagne";
        System.out.println(firstName + " "+ lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(3));

        String name = "pranav";
        String fame = "PRANAV";
        if (name.equalsIgnoreCase(fame)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}