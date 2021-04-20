package com.tourOfHerorsApi.service;

import com.tourOfHerorsApi.exception.HeroNotFoundException;
import com.tourOfHerorsApi.model.Heroes;
import com.tourOfHerorsApi.repository.HeroesRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class HeroesService {

    private final HeroesRepo heroesRepo;

    public Heroes addHero(Heroes heroes) {
        heroes.setName(UUID.randomUUID().toString());
        return heroesRepo.save(heroes);
    }

    public List<Heroes> findAllHeroes() {
        return heroesRepo.findAll();
    }

    public  Heroes findHeroById(Long id) {
        return heroesRepo.findById(id).orElseThrow(() -> new HeroNotFoundException("Hero by id " + id + " was not found."));
    }

    public void deleteHero(Long id) {
        heroesRepo.deleteById(id);
    }
}
