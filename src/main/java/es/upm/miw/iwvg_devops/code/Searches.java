package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

/**
 * primeros cuatro valores distintos del último commit realizado de la liberación anterior: 3150
 * 0 Stream<String> findUserFamilyNameInitialByAnyProperFraction();
 * 1 Stream<String> findUserIdByAnyProperFraction();
 * 3 Fraction findFractionDivisionByUserId(String id);
 * 5 Stream<String> findUserIdByAllProperFraction();
 */
public class Searches {


    public Stream<String> findUserFamilyNameInitialByAnyProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFamilyName().startsWith("B"))
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper(fraction)))
                .map(User::fullName);
    }

    public Stream<String> findUserIdByAnyProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper(fraction)))
                .map(User::getId);

    }
}
