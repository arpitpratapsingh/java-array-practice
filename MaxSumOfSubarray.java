public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int[] arr = {10,11,13,6,7,8,14};
        int sum = 0;
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++){
            currentSum = arr[i];
            for(int j = i; j < arr.length-1; j++){
                if(arr[j]+1 == arr[j+1]){
                    currentSum = currentSum+arr[j+1];
                    System.out.println(currentSum+" "+arr[j+1]);
                }else{
                    break;
                }
            }
            if(currentSum > sum){
                sum = currentSum;
            }
        }
        System.out.println("The max sum of a contiguous subarray is : "+sum);
        
    }
    
}
