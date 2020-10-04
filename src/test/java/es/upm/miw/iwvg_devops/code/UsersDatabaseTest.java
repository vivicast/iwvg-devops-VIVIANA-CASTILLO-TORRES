package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersDatabaseTest {
    private UsersDatabase usersDatabase;


    @Test
    void testFindAll(){
        usersDatabase = new UsersDatabase();
        assertEquals(8,usersDatabase.findAll().count());
    }
}
