import java.util.Arrays;
import java.util.Scanner;
class Image{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of nxn matrix : ");
        int z = sc.nextInt();
        int[][] image = new int[z][z];
        System.out.println("Enter the value of matrix in 0 and 1 form : ");


        for(int i=0; i< image.length ; i++){
            for( int j =0 ; j< image.length ; j++){
                image[i][j]=sc.nextInt();
            }
        }
        
        int [][] rev = new int[image[0].length][image.length];
        for(int i=0; i<image.length; i++){
            int k=0;
            for(int j=image[i].length-1; j>=0; j--){
                rev[i][k++] = image[i][j];
            }
        }
        for(int i=0; i<rev.length; i++){
            for(int j=0; j<rev[i].length; j++){
                if(rev[i][j]==1) 
                     rev[i][j]=0;
                else if(rev[i][j]==0)
                    rev[i][j]=1;
            }
        }
        System.out.println(Arrays.deepToString(image));
        System.out.println();
        System.out.println(Arrays.deepToString(rev));
    }
}