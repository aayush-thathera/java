import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class InvalidAgeException extends Exception{
        public InvalidAgeException (String n){
            System.out.println(n);
        }
}
public class aa {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int a=15;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("this is finally");
        }
        //task 2
        System.out.println("Task 2");
        int  arry[]={1,2,3,4,5,6};
        try {
            System.out.println(arry[6]);
        } catch (Exception e) {
         System.out.println(e);
        }
        //task 3
        System.out.println("Task 3");
        Scanner sc =new Scanner(System.in);
        
        try {
            int g =sc.nextInt();
            int h =sc.nextInt();
            int j=g/h;
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch(InputMismatchException e){
           System.out.println(e);
        }
        //task 4
        System.out.println("Task 4");
       System.out.println("enter the age");
       int age=sc.nextInt();
       try {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age.");
    } catch (InvalidAgeException e) {
        System.out.println(e);
    }
        
        //task5
        System.out.println("Task 5");
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e);}
            `
       }
       //task5
       public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
 }

