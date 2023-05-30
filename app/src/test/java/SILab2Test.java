import org.junit.Test;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testFunctionWithNullUser() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("Mandatory information missing!", ex.getMessage());
        }
    }

    @Test
    public void testFunctionWithNullPassword() {
        User user = new User("username", null, "test@test.com");
        List<User> allUsers = new ArrayList<>();

        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("Mandatory information missing!", ex.getMessage());
        }
    }
    @Test
    public void testFunctionWithValidData() {
        User user = new User("username", "Password123", "test@test.com");
        List<User> allUsers = Arrays.asList(
                new User("testUsser", "testPass", "test@test2.com")
        );

        boolean result = SILab2.function(user, allUsers);
        assertTrue(result);
    }

    @Test
    public void testFunctionWithInvalidData() {
        User user = new User("username", "password", "test@test.com");
        List<User> allUsers = Arrays.asList(
                new User("testUsser", "testPass", "test@test2.com")
        );

        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }
}