package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    private Searches searches;

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction() {

        searches = new Searches();
        assertEquals(List.of("Ana Blanco", "Antonio Blanco"), searches.findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }


    @Test
    void testFindUserIdByAnyProperFraction() {

        searches = new Searches();
        assertEquals(List.of("1", "2", "3", "5"), searches.findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));

    }
}
