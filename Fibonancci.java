import java.util.*;
public class Fibonancci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int first =0;
        int second =1;
        System.out.print(first + " " + second + " ");
        for(int i=1;i<=n;i++){
            int Three= first+second;
            System.out.print(Three + " ");
            first=second;
            second=Three;
        }

    }
}
