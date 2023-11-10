package Array.Easy;

import java.util.ArrayList;

public class RoatateByKPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int n = arr.length;
        int k =3;

        //  rotateLeft(arr, n , k);
     //   rotateRight(arr, n , k);
        rotateLeftOptimal(arr,n,k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void rotateLeftOptimal(int[] arr, int n, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotateLeft(int[] arr, int n, int k) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i <k ; i++) {
            temp.add(arr[i]);
        }
        for (int i = k; i <n ; i++) {
            arr[i-k]=arr[i];
        }
        for (int i = n-k; i <n ; i++) {
            arr[i]=temp.get(i-(n-k));
        }
    }

}


