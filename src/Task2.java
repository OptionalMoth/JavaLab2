import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        System.out.println("Welcome To the Mars Weight Calculator");
        System.out.println("What is your Mass");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float Mars = (float) (a*0.38);
        double b = Mars;
        double c = Integer.MIN_VALUE + 0.1000 + b;



        System.out.println(a+"kg on Earth is "+Mars+"kg on Mars");
        System.out.println("Kilogram on Mars after converting to double"+b);
        System.out.println("Kilograms on Mars displayed to four decimal places:"+c);
        System.out.println("Kilograms when casted to integer ");
        System.out.println("The ASCII table equivalent  of marsWeightInInt is");
        System.out.println("An example of a mathematical operation on the char type:");
        System.out.println("You entered integer " + a);

    }
}
