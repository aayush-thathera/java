import java.util.*;
public class funtiongreater {
    public static int Greater(int a,int b){
        if (a>b) {
            System.out.println( a  + "is greater");
        } else {
            System.out.println(b+ "is greater");
        }
        return 1;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       Greater(a, b);
    }

}
