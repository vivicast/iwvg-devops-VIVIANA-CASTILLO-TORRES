package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    private Searches searches;

    @BeforeEach
    void before() {
        searches = new Searches();
    }

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction() {

        assertEquals(List.of("Fernandez", "Blanco", "López", "Blanco", "Jimenez", "Perez"),
                searches.findUserFamilyNameInitialByAnyProperFraction()
                        .collect(Collectors.toList()));
    }


    @Test
    void testFindUserIdByAnyProperFraction() {

        assertEquals(List.of("1", "2", "3", "5", "7", "8"), searches.findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));

    }

    @Test
    void testFindUserIdByAllProperFraction() {
        assertEquals(List.of("7", "8"), searches.findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionDivisionByUserId(){

        Fraction f2 = searches.findFractionDivisionByUserId("4");
        assertEquals(8, f2.getNumerator());
        assertEquals(8, f2.getDenominator());

    }

}
