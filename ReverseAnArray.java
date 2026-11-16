public class ReverseAnArray {
    static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,7};
        int arr1[] = reverse(arr);
        for(int i = 0; i <= arr1.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
