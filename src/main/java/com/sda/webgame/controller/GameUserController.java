package com.sda.webgame.controller;

import com.sda.webgame.model.dto.GameUserDto;
import com.sda.webgame.model.response.ResponseMessage;
import com.sda.webgame.services.IGameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameUserController {

    @Autowired
    private IGameUserService gameUserService;


    @RequestMapping(params = "/register", method = RequestMethod.POST)
    public ResponseMessage registerUser(@RequestBody GameUserDto user) {

    };
}
