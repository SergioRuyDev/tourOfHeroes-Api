package com.tourOfHerorsApi.controller;

import com.tourOfHerorsApi.model.Heroes;
import com.tourOfHerorsApi.repository.HeroesRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HeroesController {

    public HeroesRepo heroesRepo;

    @GetMapping("/heroes")
    public ResponseEntity<List<Heroes>> getAllHeroes() {
        List<Heroes> heroes =
    }

}
