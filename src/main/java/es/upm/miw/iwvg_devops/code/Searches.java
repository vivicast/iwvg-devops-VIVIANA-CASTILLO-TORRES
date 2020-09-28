package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {


    public Stream<String> findUserFamilyNameInitialByAnyProperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFamilyName().startsWith("B"))
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper(fraction)))
                .map(User::fullName);
    }


}
