package school.mjc.stage0.module3.task4;
import java.util.Scanner;
public class FormulaCreator {
    public static void main(String[] args) {
      Scanner user_input = new Scanner (System.in);
        float a;
        a = user_input.nextFloat();
        float b;
       b = user_input.nextFloat();
        float result;
        result=(9*a*a-5*b+2+a-7)*((a+b-4*a*b)/2);
        System.out.println(result);
    }
}
