public class Complex {
    private int x;
    private int y;

    public Complex() {
        this.x = 0;
        this.y = 0;
    }

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Complex add(Complex firstComplex, Complex secondComplex) {
        // Let z1 = (a + ib)
        // Let z2 = (c + id)
        // Then, z1 + z2 = (a + c) + i(b + d)
        int realPart = firstComplex.x + secondComplex.x;
        int imaginaryPart = firstComplex.y + secondComplex.y;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex firstComplex, Complex secondComplex) {
        // Let z1 = (a + ib)
        // Let z2 = (c + id)
        // Then, z1 * z2 = (ac - bd) + i(ad + bc)
        int realPart = ((firstComplex.x * secondComplex.x) - (firstComplex.y * secondComplex.y));
        int complexPart = ((firstComplex.x * secondComplex.y) + (firstComplex.y * secondComplex.x));
        return new Complex(realPart, complexPart);
    }

    @Override
    public String toString() {
        return "Complex Number: " + x + " + i" + y;
    }

    public static void main(String[] args) {
        Complex calculation = new Complex();
        Complex complexNumber = new Complex(5, 3);
        Complex complexNumber2 = new Complex(4, 2);
        System.out.println(calculation.add(complexNumber, complexNumber2));
        System.out.println(calculation.multiply(complexNumber, complexNumber2));
    }
}
