 import java.util.Scanner;
 class NegativeCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,column;
        System.out.println(" Enter the no of rows : ");
        rows = sc.nextInt();
        System.out.println(" Enter the no of colomn : ");
        column = sc.nextInt();

        int[][] ans = new int[rows][column];
        System.out.println(" Enter matrix values : ");

        for (int i =0 ; i< ans.length ; i++){
            for (int j =0 ; j < ans.length ; j++){
                ans[i][j]= sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if (ans[i][j] < 0){
                    count += ans[i].length - j;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}