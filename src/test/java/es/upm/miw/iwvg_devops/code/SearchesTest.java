package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    private Searches searches;

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction(){

        searches = new Searches();
        assertEquals(List.of("Ana Blanco", "Antonio Blanco"), searches.findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }

}
