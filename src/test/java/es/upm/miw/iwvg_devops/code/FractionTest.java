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
