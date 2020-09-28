package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4, 2);
    }

    @Test
    void testFraction() {

        Fraction fract = new Fraction();
        assertEquals(1, fract.getNumerator());
        assertEquals(1, fract.getDenominator());

    }

    @Test
    void testFractionIntInt() {

        assertEquals(4, this.fraction.getNumerator());
        assertEquals(2, this.fraction.getDenominator());

    }

    @Test
    void testIsProper() {


        assertEquals(false, this.fraction.isProper(this.fraction));

    }

    @Test
    void testIsImproper() {
        assertEquals(true, this.fraction.isImproper(this.fraction));

    }

    @Test
    void testSum() {

        Fraction fract1 = new Fraction(2, 3);
        Fraction fract2 = new Fraction(4, 5);

        Fraction result = this.fraction.sum(fract1, fract2);
        assertEquals(22, result.getNumerator());
        assertEquals(15, result.getDenominator());


        Fraction fract3 = new Fraction(3, 4);
        Fraction fract4 = new Fraction(2, 4);

        Fraction result2 = this.fraction.sum(fract3, fract4);
        assertEquals(5, result2.getNumerator());
        assertEquals(4, result2.getDenominator());


        Fraction fract5 = new Fraction(11, 10);
        Fraction fract6 = new Fraction(2, 3);

        Fraction result3 = this.fraction.sum(fract5, fract6);
        assertEquals(53, result3.getNumerator());
        assertEquals(30, result3.getDenominator());
    }

    @Test
    void testMultiply() {

        Fraction fract1 = new Fraction(2, 3);
        Fraction fract2 = new Fraction(4, 5);

        Fraction result = this.fraction.multiply(fract1, fract2);
        assertEquals(8, result.getNumerator());
        assertEquals(15, result.getDenominator());

    }

    @Test
    void testIsEquivalent() {


        Fraction fract1 = new Fraction(2, 4);
        Fraction fract2 = new Fraction(3, 6);
        assertEquals(true, this.fraction.isEquivalent(fract1, fract2));

        Fraction fract3 = new Fraction(3, 7);
        Fraction fract4 = new Fraction(7, 3);
        assertEquals(false, this.fraction.isEquivalent(fract3, fract4));
    }
    @Test
    void testDivide(){

        Fraction fract1 = new Fraction(2, 3);
        Fraction fract2 = new Fraction(4, 5);
        Fraction result = this.fraction.divide(fract1, fract2);
        assertEquals(10, result.getNumerator());
        assertEquals(12, result.getDenominator());

    }
    @Test
    void testDecimal() {

        assertEquals(2.0, this.fraction.decimal(), 10e-5);


    }

    @Test
    void testSetNumerator() {

        this.fraction.setNumerator(1);
        assertEquals(1, this.fraction.getNumerator());
    }

    @Test
    void testDenominator() {

        this.fraction.setDenominator(1);
        assertEquals(1, this.fraction.getDenominator());
    }


}
