import java.util.*;
public class array2dlinearse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] sum=new int[3][4];
        //input
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<4;j++){
                sum[i][j]=sc.nextInt();
            }
        }
        //searching
        System.out.println("Enter the number how is searhing");
        int x=sc.nextInt();        
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<4;j++){
                if(sum[i][j]==x){
                    System.out.println("(" + i + j + ")");
                }
            }
        }
}
}
