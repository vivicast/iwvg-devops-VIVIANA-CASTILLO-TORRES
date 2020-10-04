package es.upm.miw.iwvg_devops.code;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper(Fraction fraction) {
        return fraction.getNumerator() < fraction.getDenominator();
    }

    public boolean isImproper(Fraction fraction) {
        return fraction.getNumerator() > fraction.getDenominator();
    }

    public Fraction add(Fraction fraction1, Fraction fraction2) {
        Fraction result = new Fraction();

        if (fraction1.getDenominator() == (fraction2.getDenominator())) {
            result.setNumerator(fraction1.getNumerator() + fraction2.getNumerator());
            result.setDenominator(fraction1.getDenominator());
        } else {
            int mcm = Utils.minimumCommonMultiple(fraction1.getDenominator(), fraction2.getDenominator());

            result.setNumerator((mcm / fraction1.getDenominator() * fraction1.getNumerator() +
                    mcm / fraction2.getDenominator() * fraction2.getNumerator()));
            result.setDenominator(mcm);

        }
        return result;
    }


    public Fraction multiply(Fraction fraction1, Fraction fraction2) {
        Fraction result = new Fraction();
        result.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        return result;
    }


    public boolean isEquivalent(Fraction fraction1, Fraction fraction2) {

        int extremes = fraction1.getNumerator() * fraction2.getDenominator();
        int medium = fraction1.getDenominator() * fraction2.getNumerator();
        return extremes == medium;
    }

    public Fraction divide(Fraction fraction1, Fraction fraction2) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        fraction.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
        return fraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }


}