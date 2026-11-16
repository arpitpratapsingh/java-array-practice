public class FirstDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,6,6};
        int i = 0, duplicateIndex = -1;
        while (i <= arr.length - 1) {
            int j = i + 1;
            while (j <= arr.length - 1) {
                if(arr[i] == arr[j]){
                    duplicateIndex = i;
                    System.out.println(duplicateIndex);
                    break;
                }
                j++;
            }
            if(duplicateIndex != -1){
                break;
            }
            i++;
        }
        if(duplicateIndex != -1){
            System.out.println("first duplicate element is : "+arr[duplicateIndex]);
        }else{
            System.out.println("duplicate element does not exist");
        }
    }
}
