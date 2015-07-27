package de.tblasche.example.modules.user.service;

import de.tblasche.example.Application;
import de.tblasche.example.modules.user.enums.HairColor;
import de.tblasche.example.modules.user.representations.UserRepresentation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceTest {

    @Inject
    private UserService userService;

    @Test
    public void testCheckCredentials() throws Exception {
        assertTrue(userService.checkCredentials("kkleber", "kkleber-pwd"));
        assertFalse(userService.checkCredentials("foo", "bar"));
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<UserRepresentation> allUsers = userService.getAllUsers();

        assertNotNull(allUsers);
        assertSame(allUsers.size(), 2);
    }

    @Test
    public void testGetUserByUsername() throws Exception {
        UserRepresentation user = userService.getUserByUsername("kkleber");

        assertNotNull(user);
        assertEquals("kkleber", user.getUsername());
    }

    @Test
    public void testGetUsersByHairColor() throws Exception {
        List<UserRepresentation> users = userService.getUsersByHairColor(HairColor.BLOND);

        assertNotNull(users);
        assertSame(1, users.size());
        assertEquals("Klaus", users.get(0).getFirstName());
    }
}
