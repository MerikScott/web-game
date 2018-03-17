package com.sda.webgame.repositories;

import com.sda.webgame.model.GameWorld;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GameWorldRepository extends CrudRepository<GameWorld, Long> {
}
