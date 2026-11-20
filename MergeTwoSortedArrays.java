public class MergeTwoSortedArrays {
    static int[] merge(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i < mergedArray.length; i++){
            if(counter1 == arr1.length){
                mergedArray[i] = arr2[counter2];
                counter2++;
            }
            if(counter2 == arr2.length){
                mergedArray[i] = arr1[counter1];
                counter1++;
            }
            else if(arr1[counter1]<arr2[counter2]){
                mergedArray[i] = arr1[counter1];
                counter1++;
            }
            else if(arr2[counter2] < arr1[counter1]){
                mergedArray[i] = arr2[counter2];
                counter2++;
            }
        }
        return mergedArray;
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
