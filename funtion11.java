import java.util.Scanner;

public class funtion11 {
    public static int SmallestNumber(int a,int b,int c){
        if (a<b&&a<c){
            System.out.println(a + "is smallest");
        }else if (b<a&&b<c){
            System.out.println(b + "is smallest");
        }else{
            System.out.println(c + "is smallest");
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        SmallestNumber(a, b, c);
    }
}
