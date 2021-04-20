package com.tourOfHerorsApi.controller;

import com.tourOfHerorsApi.model.Hero;
import com.tourOfHerorsApi.service.HeroesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
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

    @PostMapping("/add")
    public ResponseEntity<Hero> addHero(@RequestBody Hero hero) {
        Hero newHero = heroesService.addHero(hero);
        return new ResponseEntity<>(newHero, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Hero> updateHero(@RequestBody Hero hero) {
        Hero updateHero = heroesService.updateHero(hero);
        return new ResponseEntity<>(updateHero, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHero(@PathVariable("id") Long id) {
        heroesService.deleteHero(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
