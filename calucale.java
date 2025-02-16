import java .util.*;
public class calucale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape to perform (circle, Rectangle, square):  ");
        String object =sc.next();
        switch(object){
            //case 1
        case "circle":
        System.out.println("Enter the radius");
        double r =sc.nextDouble();
        double c=3.14*r*r;
        System.out.println(c);
        break;
        //case 2
        case "Rectangle":
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the width");
        int w=sc.nextInt();
        int result=l*w;
        System.out.println("Area of the rectangle: " + result);
        break;
        //case 3
        case "square":
         System.out.println("enter the side of square");
         int a =sc.nextInt();
         int s= a*a ;
         System.out.println("Area of the square: " + s);
         break;
         default:
         System.out.println("Invalid shape entered");
        }
    }
}
