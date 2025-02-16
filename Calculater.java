import java.util.*;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two number");
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the perform thr operantion");
        double c=0;
        char operantion =sc.next().charAt(0);
        switch(operantion){
         case '+':
             c=a+b;
             break;
         case '-':
          c=a-b;
          break;
          case'*':
          c=a*b;
          break;
          case '/':
          if (b!=0){
            c=a/b;
          }else{
             System.out.println("not dividion");
          }
          default:
          System.out.println("invalide ");
        }
        System.out.println(c);
    }
}
