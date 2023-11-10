package Array.Easy;
public class LargestElement {
    public static int largest(int arr[]){
       int max= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4,5,7,9,10, 6};
        System.out.println(largest(arr));
    }
}
