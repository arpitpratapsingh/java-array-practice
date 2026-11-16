public class FrequencyOfTheElements {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,7,7,1,5,9};
        
        boolean vis[] = new boolean[arr.length];
        int count;

        for(int i = 0; i<=arr.length-1; i++){
            count = 1;
            if(vis[i] == false){
                for(int j = i+1; j <= arr.length-1; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        vis[j] = true;
                    }
                }
                System.out.println("The element is : "+arr[i] + " and its count is : " + count);
            }
            
        }
    }
}
