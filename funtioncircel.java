import java.util.*;
public class funtioncircel {
    public static double Area(double r){
        double c= 3.14* r*r;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        Area(r);
    }
}
