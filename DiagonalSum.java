 
 import java.util.Scanner;
 class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows and columns in a square matrix : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter values of matrix :");
        for (int i =0 ; i<n;i++){
             for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
             }
        }
        

        int i, j, sum=0;

        for(i=0; i<mat.length; i++)
        {
            for(j=i; j<mat[i].length; j++)
            {
                if(i==j){
                    sum= sum+mat[i][j];
                    break;
                }

            }
        } 
        for(i=0; i<mat.length; i++)
        {
            for(j=0; j<mat[i].length; j++)
            {
                if(i+j == mat.length-1)
                {
                    sum= sum+mat[i][j];
                    break;
                }

            }
        } 

        if(mat.length %2 ==1)
        {
            i=mat.length/2;
            sum=sum-mat[i][i];
        }

        System.out.println( sum);
    }
}