import java.util.*;
public class arraylinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        //linear search
        System.out.println("Enter the number to search");
        int a =sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==a){
                System.out.println(i);
            }
        }
    }
}
