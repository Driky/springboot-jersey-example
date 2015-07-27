package de.tblasche.example.modules.user.representations;

import de.tblasche.example.modules.user.enums.HairColor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = {"username"})
public class UserRepresentation {

    private String username;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String street;

    private String houseNumber;

    private String zipCode;

    private String city;

    private HairColor hairColor;

    public UserRepresentation(
            String username,
            String firstName,
            String lastName,
            String emailAddress,
            String street,
            String houseNumber,
            String zipCode,
            String city,
            HairColor hairColor) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.hairColor = hairColor;
    }
}
