package com.sda.webgame.services;

import com.sda.webgame.model.Colony;
import com.sda.webgame.model.dto.CreateColonyDto;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IColonyService {

    Optional<Colony> tryCreateColony (CreateColonyDto dto);

    Optional<Colony> getColony (Long id);
}
