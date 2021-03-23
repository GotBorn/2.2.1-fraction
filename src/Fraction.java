public class Fraction {
    int numerator;// Числитель
    int denominator = 1;// Знаменатель

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        numerator = num;
        denominator = denom;
    }

    private int GCD(int a, int b) { // НОД
        if (b == 0) return a;
        return GCD(b,a % b);
    }

    public void Add(Fraction b) {
        this.numerator = this.numerator * b.denominator + b.numerator * this.denominator;
        this.denominator *= b.denominator;
        int gcd = GCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void Divide(Fraction b) {
        this.numerator *= b.denominator;
        this.denominator *= b.numerator;
        int gcd = GCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void Multiply(Fraction b) {
        this.numerator *= b.numerator;
        this.denominator *= b.denominator;
        int gcd = GCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }
}