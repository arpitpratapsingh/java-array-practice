public class MergingOfTwoArrays {
    static int[] mergedArray(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];
        for (int i = 0; i < merged.length; i++) {
            if (i < arr1.length) {
                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[i-arr1.length];
            }
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        
        int[] merged = mergedArray(arr1, arr2);

        for (int i : merged) {
            System.out.print(i+" ");
        }
        
    }
}
