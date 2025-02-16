import java.util.*;
public class Funtionpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        Power(x,n);
    }
    public static int Power(int x,int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*x;
            System.out.println(fact);
       
            
        }
        return 1;
     }
}
