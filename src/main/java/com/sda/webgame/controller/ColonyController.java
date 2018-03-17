package com.sda.webgame.controller;

import com.sda.webgame.model.Colony;
import com.sda.webgame.model.dto.CreateColonyDto;
import com.sda.webgame.model.response.ResponseMessage;
import com.sda.webgame.model.response.StatusResponse;
import com.sda.webgame.services.IColonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/colony/")
public class ColonyController {

    @Autowired
    private IColonyService colonyService;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseMessage<Colony> createColony(@RequestBody CreateColonyDto dto) {
        Optional<Colony> createdColony = colonyService.tryCreateColony(dto);

        if (createdColony.isPresent()) {
            return new ResponseMessage<>(StatusResponse.OK, null, createdColony.get());
        } else {
            return new ResponseMessage<>(StatusResponse.REQUEST_ERROR, "Unable to create colony", null);
        }
    }
}
