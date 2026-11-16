public class Biggest {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 71, 8, 9, 10 };
        int biggest = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        System.out.println("biggest element present in the given array is : "+biggest);
    }
}
