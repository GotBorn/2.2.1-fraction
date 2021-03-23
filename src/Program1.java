import java.util.Scanner;
import java.util.Locale;

public class Program1 {
    
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(2, 5);
        a.Add(b);
        System.out.println(a.numerator + "/" + a.denominator);

        Fraction c = new Fraction(1, 3);
        Fraction d = new Fraction(2, 5);
        c.Multiply(d);
        System.out.println(c.numerator + "/" + c.denominator);

        Fraction e = new Fraction(1, 2);
        Fraction f = new Fraction(1, 4);
        e.Divide(f);
        System.out.println(e.numerator + "/" + e.denominator);

    }
}


