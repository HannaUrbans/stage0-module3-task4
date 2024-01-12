package school.mjc.stage0.module3.task4;
import java.util.Scanner;
public class FormulaCreator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        float a;
        a = user_input.nextFloat();
        float b;
        b = user_input.nextFloat();
        float firstBrackets;
        firstBrackets=9*a*a-5*b+2+a-7;
        float secondBracketsDividend;
        byte secondBracketsDivisor;
        secondBracketsDividend=a+b-4*a*b;
        secondBracketsDivisor=2;
        float secondBrackets;
        secondBrackets=secondBracketsDividend/secondBracketsDivisor;
        float result;
        result=firstBrackets*secondBrackets;
        System.out.println(result);
    }
}
