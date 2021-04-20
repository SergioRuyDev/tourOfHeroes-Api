package com.tourOfHerorsApi.service;

import com.tourOfHerorsApi.exception.HeroNotFoundException;
import com.tourOfHerorsApi.model.Hero;
import com.tourOfHerorsApi.repository.HeroRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class HeroesService {

    private final HeroRepo heroRepo;

    public Hero addHero(Hero hero) {
        hero.setName(UUID.randomUUID().toString());
        return heroRepo.save(hero);
    }

    public List<Hero> findAllHeroes() {
        return heroRepo.findAll();
    }

    public Hero findHeroById(Long id) {
        return heroRepo.findById(id).orElseThrow(() -> new HeroNotFoundException("Hero by id " + id + " was not found."));
    }

    public Hero updateHero(Hero hero) {
        return heroRepo.save(hero);
    }

    public void deleteHero(Long id) {
        heroRepo.deleteById(id);
    }
}
