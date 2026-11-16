public class MoveZeroesToTheEnd {
    static int[] shiftZeroes(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = i; j <= arr.length-2; j++){
                if(arr[j] == 0){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,3,5,0,6,7};
        int[] arr1 = shiftZeroes(arr);

        for(int i = 0; i <= arr1.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
