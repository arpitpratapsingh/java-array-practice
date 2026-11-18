public class NthBiggestElemnt {
    static int[] sortArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,9,11,12};
        int target = 3;
        int[] sortedArray = sortArray(arr);
        for (int i : sortedArray) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The "+target+" biggest element is : "+sortedArray[target-1]);
        System.out.println("The "+target+" smallest element is : "+sortedArray[arr.length-target]);
    }
}
