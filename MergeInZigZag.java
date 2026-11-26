public class MergeInZigZag{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        int[] arr = new int[arr1.length+arr2.length];
        
        int count = 0;
        int j = 0, k = 0;
        while(count < arr.length){
            if(count%2 == 0 && j<arr1.length){
                arr[count] = arr1[j];
                count++; 
                j++;
            }
            else if(count%2 != 0 && k<arr2.length){
                arr[count] = arr2[k];
                count++;
                k++;
            }else{
                if(j<arr1.length){
                    arr[count] = arr1[j];
                    count++;
                    j++;
                }else{
                    arr[count] = arr2[k];
                    count++;
                    k++;
                }
            }
        }
        for ( int i : arr) {
            System.out.print(i+" ");
        }
    }
}