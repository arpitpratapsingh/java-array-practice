public class MergeTwoSortedArrays {
   static int[] merge(int[] arr1, int[] arr2){
        int arr[] = new int[arr1.length+arr2.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(i < arr1.length){
                arr[i] = arr1[i];

            }else{
                arr[i] = arr2[count];
                count++;
            }
        }
        return arr;
   }
   public static void main(String[] args) {
        int[] arr1 = {1,2,5,7,9};
        int[] arr2 = {3,4,6,8};

        int[] mergedArray = merge(arr1, arr2);
        
        for (int i : mergedArray) {
            System.out.print(i+" ");

        }
    }
}
