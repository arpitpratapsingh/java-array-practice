public class PrintSubarraysWhereElementsAreConscutive {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,5,6,9};
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = start; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                if(j+1 < arr.length && arr[j] + 1 != arr[j + 1]){
                    break;
                }
                
            }
            System.out.println();
        }
    }
}
