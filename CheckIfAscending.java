public class CheckIfAscending {
    static boolean isAscending(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        if(isAscending(arr)){
            System.out.println("given array is sorted in ascending order");
        }else if(isDescending(arr)){
            System.out.println("given array is sorted in descending order");
        }
        else
            System.out.println("is not sorted");
    }
}
