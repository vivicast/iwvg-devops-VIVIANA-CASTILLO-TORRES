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
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper(fraction)))
                .map(User::getFamilyName);
    }

    public Stream<String> findUserIdByAnyProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper(fraction)))
                .map(User::getId);

    }
    public Stream<String> findUserIdByAllProperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .allMatch(fraction -> fraction.isProper(fraction)))
                .map(User::getId);

    }

    public Fraction findFractionDivisionByUserId(String id) {
        Fraction f = new Fraction();
        return new UsersDatabase().findAll()
                .filter(user -> user.getId().equals(id))
                .flatMap(user -> user.getFractions().stream())
                .reduce(f, f::divide);


    }

}
