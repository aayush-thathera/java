class animals{
    void walk(){
        
    }
    void good(){
        System.out.println("4 lag");
    }
}
class dog extends animals{
    void walk(){
        System.out.println("dood");
    }
}
public class inheritance{
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.walk();
        mydog.good();
    }
}