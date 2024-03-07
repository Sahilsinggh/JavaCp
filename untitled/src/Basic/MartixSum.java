package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MartixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int mid = n/2;
        matrix[0][mid] = 1;
        if(n%2==0){
            matrix[0][mid-1] = 1;
        }

        for(int i =1;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                int val =  0;
                if (j - 1 >= 0 && j <= n - 1) {
                    val = val + matrix[i - 1][j - 1];
                }
                if(j<=n-1){
                    val = val+ matrix[i-1][j];
                }
                if(j+1<=n-1){
                    val = val + matrix[i-1][j+1];
                }
                matrix[i][j]= val;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
