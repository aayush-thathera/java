import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] sum=new int[3][4];
        //input
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<4;j++){
                sum[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<4;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
