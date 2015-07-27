package de.tblasche.example.modules.user.db.repositories;

import de.tblasche.example.modules.user.db.entities.UserEntity;
import de.tblasche.example.modules.user.enums.HairColor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByHairColor(HairColor hairColor);

    UserEntity findByUsername(String username);

    UserEntity findByUsernameAndPasswordHash(String username, String passwordHash);
}
