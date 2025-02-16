import java.util.*;
public class funtion1 {

        public static int PrinterMy (int a,int b,int c){
            System.out.println((a+b+c)/3);
              return 1;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        PrinterMy(a, b, c);
    }
}
