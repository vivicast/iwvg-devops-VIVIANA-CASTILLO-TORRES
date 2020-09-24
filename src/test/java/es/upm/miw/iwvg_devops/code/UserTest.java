package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction fractionOne = new Fraction(9, 5);
        fractions.add(fractionOne);
        user = new User("1", "Helen", "Smith", fractions);
    }

    @Test
    void testUser() {
        User u = new User();
        assertEquals(0, u.getFractions().size());
    }

    @Test
    void testUserStringStringStringList() {

        assertEquals("1", user.getId());
        assertEquals("Helen", user.getName());
        assertEquals("Smith", user.getFamilyName());
        assertEquals(1, user.getFractions().size());

    }

    @Test
    void testAddFraction() {

        user.addFraction(new Fraction(2, 2));
        assertEquals(2, this.user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Helen Smith", this.user.fullName());
    }

    @Test
    void testInitials() {

        assertEquals("H.", this.user.initials());

    }

    @Test
    void testSetName() {
        this.user.setName("Mary");
        assertEquals("Mary", this.user.getName());
    }

    @Test
    void testSetFamilyName() {
        this.user.setFamilyName("Potter");
        assertEquals("Potter", this.user.getFamilyName());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 5));
        this.user.setFractions(fractions);
        assertEquals(fractions, this.user.getFractions());

    }
}
