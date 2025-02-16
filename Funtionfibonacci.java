import java.util.*;
public class Funtionfibonacci {
    public static int fibonacci(int n){
       int first=0;
       int  second =1;
        System.out.println(first+ " "+ second +" ");
        for (int i=3;i<=n;i++){
            int next = first + second ;
            System.out.println(next);
            first=second;
            second=next;
           
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
    }
}
