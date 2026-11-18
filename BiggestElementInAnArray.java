public class BiggestElementInAnArray {
    static int findBiggest(int[] arr){
        int biggest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }
    
    static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,1,5,7,11,6};
        int biggest = findBiggest(arr);
        int smallest = findSmallest(arr);

        System.out.println("Biggest element is : "+biggest);
        System.out.println("Smallest element is : "+smallest);
    }
}
