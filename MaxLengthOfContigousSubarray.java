public class MaxLengthOfContigousSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8,9,3};
        int maxLength = 1;
        int currentLength;

        for(int i = 0; i < arr.length; i++){
            currentLength = 1;
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                
                currentLength = end - start + 1;
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                if(j<arr.length-1 && arr[j]+1 != arr[j+1]){
                    break;
                }
            }
        }
        System.out.println(maxLength);
    }
}
