public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // find n
        // calculate sum using natural number formula,
        // subtract the sum of existing element
        int n = arr.length+1;
        int missingElement;
        int actSum = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        actSum = (n*(n+1))/2;
        missingElement = actSum-sum;

        System.out.println(missingElement);
    }
}
