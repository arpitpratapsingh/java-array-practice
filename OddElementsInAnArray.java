public class OddElementsInAnArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 8, 9, 10 };
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("index : " + i + "element is : " + arr[i]);
            }
        }
    }
}
