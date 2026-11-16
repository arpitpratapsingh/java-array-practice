public class ReplaceElementsWithSumOfTheirDigits {
    static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {12,13,72,1,15,85};
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sumOfDigits(arr[i]);
        }
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
