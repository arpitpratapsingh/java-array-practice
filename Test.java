public class Test {
    public static void main(String[] args) {
        int arr[] = {12,0,5,5,7,0,9};
        int pos = arr.length-1;
        
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos--;
            }
        }
        while(pos>=0){
            arr[pos] = 0;
            pos--;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
