package de.tblasche.example.modules.user.mapper;

import static org.junit.Assert.*;

import de.tblasche.example.Application;
import de.tblasche.example.modules.user.db.entities.UserEntity;
import de.tblasche.example.modules.user.enums.HairColor;
import de.tblasche.example.modules.user.representations.UserRepresentation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserMapperTest {

    @Inject
    private UserMapper userMapper;

    @Test
    public void testMapUserEntityToUserRepresentation() throws Exception {
        String expectedUsername = "user";
        String expectedFirstName = "fname";
        String expectedLastName = "lname";
        String expectedEmailAddress = "mail";
        String expectedStreet = "str";
        String expectedHouseNumber = "0815";
        String expectedZipCode = "04899";
        String expectedCity = "rom";
        HairColor expectedHairColor = HairColor.BLOND;

        UserRepresentation userRepresentation = userMapper.map(new UserEntity(
                expectedUsername,
                "",
                expectedFirstName,
                expectedLastName,
                expectedEmailAddress,
                expectedStreet,
                expectedHouseNumber,
                expectedZipCode,
                expectedCity,
                expectedHairColor
        ));

        assertEquals(expectedUsername, userRepresentation.getUsername());
        assertEquals(expectedFirstName, userRepresentation.getFirstName());
        assertEquals(expectedLastName, userRepresentation.getLastName());
        assertEquals(expectedEmailAddress, userRepresentation.getEmailAddress());
        assertEquals(expectedStreet, userRepresentation.getStreet());
        assertEquals(expectedHouseNumber, userRepresentation.getHouseNumber());
        assertEquals(expectedZipCode, userRepresentation.getZipCode());
        assertEquals(expectedCity, userRepresentation.getCity());
        assertEquals(expectedHairColor, userRepresentation.getHairColor());
    }
}
