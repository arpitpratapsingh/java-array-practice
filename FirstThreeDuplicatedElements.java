public class FirstThreeDuplicatedElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,2,3,7,5,7,11,4,11};
        boolean[] vis = new boolean[arr.length];
        int duplicateCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(!vis[i]){
                int count = 1;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        vis[j] = true;
                    }
                    
                }
                if (count > 1 && duplicateCount < 4) {
                    System.out.println("duplicated element is : " + arr[i]);
                    duplicateCount++;

                    if (duplicateCount == 3) {
                        break;
                    }
                }
            }
           
        }
    }
}
