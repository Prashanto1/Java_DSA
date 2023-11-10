package Array.Easy;

import static java.util.Collections.swap;

public class ZeroTOEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;

        moveZeroTOEnd(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static void moveZeroTOEnd(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i = j+1; i < n; i++) {
            if (arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }

        }
        }
    }



