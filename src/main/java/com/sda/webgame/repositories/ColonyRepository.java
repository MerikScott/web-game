package com.sda.webgame.repositories;

import com.sda.webgame.model.Colony;
import com.sda.webgame.model.GameWorldField;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface ColonyRepository extends CrudRepository <Colony, Long>{

    boolean existsColonyByField (GameWorldField field);

    Optional<Colony> getColonyById(Long id);
}
