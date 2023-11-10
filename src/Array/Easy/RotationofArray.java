package Array.Easy;

public class RotationofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

       rotateLeft(arr, n);
        // rotateRight(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static void rotateRight(int[] arr, int n) {
        int temp = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            arr[i+1]=arr[i];

        }

        arr[0]=temp;
    }

    public static void rotateLeft(int arr[], int n){

        int temp= arr[0];

        for (int i = 0; i <n-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        }
    }


