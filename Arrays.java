import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];
        //intput
        for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
        }
        //intput
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
