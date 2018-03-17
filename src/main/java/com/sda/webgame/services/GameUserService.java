package com.sda.webgame.services;

import com.sda.webgame.model.GameUser;
import com.sda.webgame.model.dto.GameUserDto;
import com.sda.webgame.model.factory.GameUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sda.webgame.repositories.GameUserRepository;

import java.util.Optional;

@Service
public class GameUserService implements IGameUserService {

    @Autowired
    private GameUserRepository gameUserRepository;

    @Override
    public Optional<GameUser> tryRegister(GameUserDto dto) {

        GameUser gameUser = gameUserRepository.getGameUserByEmail(dto.getEmail());
        if (gameUser != null) {
            return Optional.empty();
        } else {
              GameUser user = gameUserRepository.save(GameUserFactory.createGameUser(dto));
              return Optional.ofNullable(user);
        }

    }

}
