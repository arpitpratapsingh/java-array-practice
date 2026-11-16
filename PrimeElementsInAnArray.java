public class PrimeElementsInAnArray {
    static boolean isPrime(int num){
        if(num <= 1)
            return false;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,17,16,15,19,20,22};
        for(int i = 0; i <= arr.length-1; i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
