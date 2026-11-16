public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5};
        boolean[] vis = new boolean[arr.length];
        int size = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(vis[i] == false){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        vis[j] = true;
                        size--;
                    }
                }
            }
        }
        int[] newArr = new int[size];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(vis[i] == false){
                newArr[count] = arr[i];
                count++;
            }
        }
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}
