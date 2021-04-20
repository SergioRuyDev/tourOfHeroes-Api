package com.tourOfHerorsApi.service;

import com.tourOfHerorsApi.exception.AddException;
import com.tourOfHerorsApi.exception.HeroNotFound;
import com.tourOfHerorsApi.model.Hero;
import com.tourOfHerorsApi.repository.HeroRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class HeroService {

    private final HeroRepo heroRepo;

    public Hero addHero(Hero hero) {
        Hero heroExisted = heroRepo.findAllByHeroName(hero.getHeroName());

        if (heroExisted != null && !heroExisted.equals(hero)) {
            throw new AddException("You already added this hero.");
        }
        return heroRepo.save(hero);
    }

    public List<Hero> findAllHeroes() {
        return heroRepo.findAll();
    }

    public Hero findHeroById(Long id) {
        return heroRepo.findById(id).orElseThrow(() -> new HeroNotFound("Hero by id " + id + " was not found."));
    }

    public Hero updateHero(Hero hero) {
        return heroRepo.save(hero);
    }

    public void deleteHero(Long id) {
        heroRepo.deleteHeroById(id);
    }
}
