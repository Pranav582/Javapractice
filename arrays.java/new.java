class ArrayDisplay {
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayDisplay obj = new ArrayDisplay();
        obj.display(arr);
        obj.display(arr);
        obj.display(arr);
    }
}
