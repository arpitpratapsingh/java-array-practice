public class SimpleSorting {
    static int[] sortAscending(int[] arr){
        int[] result = arr.clone();
        for(int i = 0; i < result.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(result[i] > result[j]){
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
    static int[] sortDescending(int[] arr){
        int[] result = arr.clone();
        for(int i = 0; i < result.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(result[i] < result[j]){
                    int temp = arr[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,7,9,3};
        int[] sortedAsc = sortAscending(arr);
        int[] sortedDesc = sortDescending(arr);
        System.out.println("Ascending order");
        for (int i : sortedAsc) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Descending order");
        for (int i : sortedDesc){
            System.out.print(i+" ");
        }
    }
}
