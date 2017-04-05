package id.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by WaroenglordZ on 19/03/2017.
 */
public class UserServiceTest {
    UserService userService = new UserServiceImpl();
    @Test
    public  void validateUser_ageLessThan17_returnFalse() {
        boolean result = userService.validateUser(15);
        Assert.assertEquals(false, result);

    }
    @Test
    public  void validateUser_ageMoreThan17_returnTrue() {
        boolean result = userService.validateUser(18);
        Assert.assertEquals(true, result);
    }
    @Test
    public  void printHello_returnHello() {
        String test = userService.printHello();
        Assert.assertEquals("Hello World", test);

    }
}
