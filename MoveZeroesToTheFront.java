public class MoveZeroesToTheFront {
    static int[] shiftZeroes(int[] arr){
        if(arr == null || arr.length == 1){
            return arr;
        }
        int insertPos = arr.length-1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != 0){
                arr[insertPos] = arr[i];
                insertPos--;
            }
        }
        while(insertPos >= 0){
            arr[insertPos] = 0;
            insertPos--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,3,15};
        int[] newArr = shiftZeroes(arr);
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}
