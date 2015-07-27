package de.tblasche.example.modules.user.mapper;

import de.tblasche.example.modules.user.db.entities.UserEntity;
import de.tblasche.example.modules.user.representations.UserRepresentation;

import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class UserMapper {

    public UserRepresentation map(UserEntity userEntity) {
        return (userEntity == null) ? null : new UserRepresentation(
                userEntity.getUsername(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getEmailAddress(),
                userEntity.getStreet(),
                userEntity.getHouseNumber(),
                userEntity.getZipCode(),
                userEntity.getCity(),
                userEntity.getHairColor()
        );
    }

    public List<UserRepresentation> map(List<UserEntity> userEntities) {
        return userEntities.stream().map(this::map).collect(Collectors.toList());
    }
}
