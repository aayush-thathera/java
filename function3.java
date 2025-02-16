import java.util.*;
public class function3 {
    public static int Sumtwo (int a,int b){
        int c=a+b;
        System.out.println(c);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Sumtwo(a, b);
    }
}
