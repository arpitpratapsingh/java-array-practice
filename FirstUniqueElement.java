public class FirstUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,5,3,5};
        boolean[] vis = new boolean[arr.length];
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            if(!vis[i]){
                boolean isUnique = true;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        isUnique = false;
                        vis[j] = true;
                    }
                }
                if(isUnique){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No unique element found");
        }
    }
}
