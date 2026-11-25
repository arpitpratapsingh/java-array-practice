public class Test{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        
        int size = arr1.length+arr2.length;
        
        int[] mergedArray = new int[size];
        int count = 0;
        
        for(int i = 0; i < arr1.length; i++){
            mergedArray[count] = arr1[i];
            count++;
        }
        for(int i = 0; i < arr2.length; i++){
            mergedArray[count] = arr2[i];
            count++;
        }
        for (int i : mergedArray) {
           System.out.print(i+" ");
        }

    }
}