import java.util.*;
public class Funtion {
    public static int PrintMyName(int a,int b){
          System.out.println(a*b);
          return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        PrintMyName(a,b);
    }
}
