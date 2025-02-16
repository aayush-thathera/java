 class animal {
    void speak(){
        System.out.println("speak");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("eat");
    }
}
public class inheration {
    public static void main(String[] args) {
        Dog mydog=new Dog();
        mydog.eat();
        mydog.speak();
    }
}
