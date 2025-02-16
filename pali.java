import java.util.*;
public class pali {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int c ,r,s=0,f;
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s){
            System.out.println("this number is palindorme");
        }else{
            System.out.println("this number is not palindorme");
        }
    }
}
