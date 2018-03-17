package com.sda.webgame.services;

import com.sda.webgame.model.Colony;
import com.sda.webgame.model.GameUser;
import com.sda.webgame.model.GameWorldField;
import com.sda.webgame.model.WorldFieldType;
import com.sda.webgame.model.dto.CreateColonyDto;
import com.sda.webgame.model.factory.ColonyFactory;
import com.sda.webgame.repositories.ColonyRepository;
import com.sda.webgame.repositories.GameUserRepository;
import com.sda.webgame.repositories.GameWorldFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ColonyService implements IColonyService {

    @Autowired
    private ColonyRepository colonyRepository;

    @Autowired
    private GameWorldFieldRepository gameWorldFieldRepository;

    @Autowired
    private GameUserRepository gameUserRepository;


    @Override
    public Optional<Colony> tryCreateColony(CreateColonyDto dto) {

        Optional<GameUser> userCreatingColony = gameUserRepository.getGameUserById(dto.getUserId());
        if (!userCreatingColony.isPresent()) {
            return Optional.empty();
        }
        Optional<GameWorldField> fieldOnWhichColonyIsToBePlaced = gameWorldFieldRepository.getWorldFieldById(dto.getFieldId());
        if (!fieldOnWhichColonyIsToBePlaced.isPresent()) {
            return Optional.empty();
        }

        GameWorldField field = fieldOnWhichColonyIsToBePlaced.get();
        if (field.getFieldType() != WorldFieldType.GRASS) {
            return Optional.empty();
        }

        if (colonyRepository.existsColonyByField(field)) {
            return Optional.empty();
        }

        Colony createdColony = colonyRepository.save(
                ColonyFactory.create(userCreatingColony.get(), field, dto));

        return Optional.ofNullable(createdColony);
    }
}
