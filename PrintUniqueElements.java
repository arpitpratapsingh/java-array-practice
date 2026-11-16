public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,5,7};
        boolean[] vis = new boolean[arr.length];

        boolean isDuplicate;
        for(int i = 0; i<arr.length; i++){
            isDuplicate = false;
            if(!vis[i]){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        isDuplicate = true;
                        vis[j] = true;
                    }
                    
                }
                if(!isDuplicate){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
