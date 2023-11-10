package Array.Easy;

import java.util.Scanner;

public class _2ndLargestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        System.out.println(secondMax(a));
    }
    static int secondMax(int a[]) {
        int max1 =a[0];
        int max2 =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2= max1;
                max1 = a[i];
            }
        }
        return max2;
    }

    static int max(int a[]){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];
            }
        }
        return max;
    }
}
