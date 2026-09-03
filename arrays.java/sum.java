public class sum {
    public static void main(String[] args) {
        int a [] = {1, 5, 9 ,7, 8, 5,5};
        int evenSum = 0;
        int oddSum = 0;

        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];
            } else {
                oddSum += a[i];
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}