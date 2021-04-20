package com.tourOfHerorsApi.controller;

import com.tourOfHerorsApi.model.Hero;
import com.tourOfHerorsApi.service.HeroesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/heroes")
@AllArgsConstructor
public class HeroesController {

    private final HeroesService heroesService;

    @GetMapping("/all")
    public ResponseEntity<List<Hero>> getAllHeroes(){
        List<Hero> heroes = heroesService.findAllHeroes();
        return new ResponseEntity<>(heroes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Hero> getHeroById(@PathVariable("id") Long id) {
        Hero hero = heroesService.findHeroById(id);
        return new ResponseEntity<>(hero, HttpStatus.OK);
    }



}
