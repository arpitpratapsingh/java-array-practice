public class FindTargetElement {
    static int findTarget(int[] arr, int target){
        int index = -1;
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] == target){
                index = i;
                return index;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,25,36,4,71};
        int target = 5;
        int index = findTarget(arr, target);

        if(index != -1){
            System.out.println("Element is present at index : "+index);
        }else
            System.out.println("Element not found");
    }
}
