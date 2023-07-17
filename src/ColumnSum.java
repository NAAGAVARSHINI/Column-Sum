import java.util.Scanner;

public class ColumnSum {

    public static int[] Csum(int[][] A, int n, int m){
        int[]  ColSum = new int[m];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=A[j][i];
                ColSum[i]=sum;
            }
        }
        return ColSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] A = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]= sc.nextInt();
            }
        }
        int[] result= new int[m];
        result=Csum(A, n,m);
        System.out.print("[");
        for(int i=0;i<m;i++){
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
