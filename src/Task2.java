import java.text.DecimalFormat;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        double b;
        double c;
        int d;
        char e;
        DecimalFormat numberFormat = new DecimalFormat("#.####");
        System.out.println("Welcome To the Mars Weight Calculator");
        System.out.println("What is your Mass");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float Mars = (float) (a*0.38);
        b = Mars;
        c = b;
        d = (int) c;
        e = (char)d;


        System.out.println(a+"kg on Earth is "+Mars+"kg on Mars");
        System.out.println("Kilogram on Mars after converting to double "+b);
        System.out.println("Kilograms on Mars displayed to four decimal places:"+c);

        //System.out.printf("%.3f", c);
        //System.out.println(numberFormat.format(c));

        System.out.println("Kilograms when casted to integer "+d);
        System.out.println("The ASCII table equivalent  of marsWeightInInt is "+e);
        System.out.println("An example of a mathematical operation on the char type:");

    }
}
