package com.sda.webgame.repositories;

import com.sda.webgame.model.GameUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface GameUserRepository extends CrudRepository<GameUser, Long> {

//    @Query(value = "select * from gameuser where email=1?")
    GameUser getGameUserByEmail(String email);

    Optional<GameUser> getGameUserByEmailAndPasswordHash(String email, String passwordHash);

    Optional<GameUser> getGameUserById(Long id);
}
