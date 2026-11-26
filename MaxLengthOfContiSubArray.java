public class MaxLengthOfContiSubArray {
    public static void main(String[] args) {
        int[] arr = {11,13,14,15,17,19};
        int maxCount = 0;
        int currentCount;

        for(int i = 0; i < arr.length; i++){
            currentCount = 1;
            for(int j = i; j < arr.length-1; j++){
                if(arr[j]+1 == arr[j+1]){
                    currentCount++;
                }else{
                    break;
                }
            }        
            if(currentCount>maxCount){
                maxCount = currentCount;
            }
        }
        System.out.println("Max length of contiguous sub array is : "+maxCount);
    }
}
