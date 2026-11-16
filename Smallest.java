public class Smallest {
    public static void main(String[] args) {
        int arr[] = { 22, 3, 5, 71, 8, 9, 10 };
        int smallest = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("biggest element present in the given array is : " + smallest);
    }
}
