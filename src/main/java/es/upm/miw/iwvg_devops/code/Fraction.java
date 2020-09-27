package es.upm.miw.iwvg_devops.code;


/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
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
        boolean isProper;
        isProper = false;
        if (fraction != null) {
            isProper = Utils.greaterThan(fraction.getDenominator(), fraction.getNumerator());
        }
        return isProper;
    }

    public boolean isImproper(Fraction fraction) {
        boolean isImproper;
        isImproper = false;
        if (Utils.fractionNotNull(fraction))
            isImproper = Utils.greaterThan(fraction.getNumerator(), fraction.getDenominator());

        return isImproper;
    }

    public Fraction sum(Fraction fraction1, Fraction fraction2) {
        Fraction result = new Fraction();

        if (fraction1.getDenominator() == (fraction2.getDenominator())) {
            result.setNumerator(Utils.sumNumbers(fraction1.getNumerator(), fraction2.getNumerator()));
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
        if (Utils.fractionNotNull(fraction1) & Utils.fractionNotNull(fraction2)) {
            result.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
            result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        }
        return result;
    }

    /**
     * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
     * producto de medios (denominador de la primera por el numerador de la segunda)
     */
    public boolean isEquivalent(Fraction fraction1, Fraction fraction2) {
        boolean isEquivalent;
        isEquivalent = false;

        if (Utils.fractionNotNull(fraction1) & Utils.fractionNotNull(fraction2)) {
            int extremes = Utils.multiplyNumbers(fraction1.getNumerator(), fraction2.getDenominator());
            int medium = Utils.multiplyNumbers(fraction1.getDenominator(), fraction2.getNumerator());
            if (extremes == medium) {
                isEquivalent = true;
            }
        }
        return isEquivalent;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }


}