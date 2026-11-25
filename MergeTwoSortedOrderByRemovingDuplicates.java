public class MergeTwoSortedOrderByRemovingDuplicates {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 5, 6, 7 };

        int size = arr1.length + arr2.length;
        int arr[] = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[ count];
                count++;
            }
        }
        int countVis = 0;
        boolean vis[] = new boolean[size];
        for(int i = 0; i < arr.length; i++){
            if(vis[i] == false){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        vis[i] = true;
                        countVis++;
                    }
                }
            }
        }
        int[] uniqueElementArr = new int[size-countVis];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(vis[i] == false){
                uniqueElementArr[index] = arr[i];
                index++;
            }
        }
        for (int i : uniqueElementArr) {
            System.out.print(i+" ");
        }
    }

}
