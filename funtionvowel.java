import java .util.Scanner;
public class funtionvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.println("it's is vowel");
        }else {
            System.out.println("it's not a vowel ");
        }
    }
}
