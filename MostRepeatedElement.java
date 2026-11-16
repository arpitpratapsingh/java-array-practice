public class MostRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5};
        int mostRepeatedElemnt = arr[0];
        int mostRepeatedElementCount = 0;
        boolean vis[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(vis[i] == false){
                int currentCount = 1;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        currentCount++;
                        vis[j] = true;
                    }
                }
                if (currentCount>mostRepeatedElementCount) {
                    mostRepeatedElemnt = arr[i];
                    mostRepeatedElementCount = currentCount;
                }
            }
            
            
        }
        System.out.println("Most repeated element is : "+mostRepeatedElemnt+" with total count of :"+mostRepeatedElementCount);
    }
}
