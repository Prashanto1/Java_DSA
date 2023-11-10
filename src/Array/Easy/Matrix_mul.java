package Array.Easy;

public class Matrix_mul {
    public static void main(String[] args) {
        int a[][] = {{3, 5, 5}, {6, 7, 3}, {5, 7, 3}};
        int[][] b = {{1,0,0}, {0,1,0}, {0,0,1}};
        int[][] c = new int[3][3];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = 0;

                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
//                    System.out.print(c[i][j] + " ");
                }
            }
//            System.out.println(" ");

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");

        }
    }
}

