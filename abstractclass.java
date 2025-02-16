abstract class Marks {
    // Abstract method to calculate percentage
    public abstract double getPercentage();
}

// Class A for student A
class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    // Constructor to initialize marks of student A
    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Method to calculate percentage
    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

// Class B for student B
class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    // Constructor to initialize marks of student B
    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Method to calculate percentage
    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class abstractclass {
    public static void main(String[] args) {
        // Create object for student A
        A studentA = new A(85, 90, 78);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");

        // Create object for student B
        B studentB = new B(88, 76, 92, 85);
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}

