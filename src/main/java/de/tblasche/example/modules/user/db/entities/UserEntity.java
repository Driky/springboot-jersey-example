package de.tblasche.example.modules.user.db.entities;

import de.tblasche.example.modules.user.enums.HairColor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })
public class UserEntity {

    @Id
    @SequenceGenerator(name = "UserSequenceGenerator", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UserSequenceGenerator")
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(name = "hair_color")
    private HairColor hairColor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", nullable = false, insertable = false, updatable = false)
    private Date createdTime;

    public UserEntity(
            String username,
            String passwordHash,
            String firstName,
            String lastName,
            String emailAddress,
            String street,
            String houseNumber,
            String zipCode,
            String city,
            HairColor hairColor) {
        this.username = username;
        this.passwordHash = passwordHash;
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
