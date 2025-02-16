import java .util.*;
public class array1 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of arrays");
    int a=sc.nextInt();
        int [] marks=new int [a];
        //input
        for (int i=0;i<5;i++){
            marks[i]=sc .nextInt();
        }
        //output
       for (int i=0;i<marks.length;i++){
         System.out.println(marks[i]);
        }
      // System.out.println(Arrays.toString(marks));
    }
}
