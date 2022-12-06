package com.example.serviceshuffle.controller;

import com.example.serviceshuffle.model.Number;
import com.example.serviceshuffle.service.ShuffleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("shuffle")
public class ShuffleController {


    @Autowired
    private ShuffleService shuffleService;

    @PostMapping()
    public List<Integer> shuffle(@Valid @RequestBody Number number){

        return shuffleService.shuffle(number);
    }

}
