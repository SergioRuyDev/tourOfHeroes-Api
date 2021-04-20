package com.tourOfHerorsApi.repository;

import com.tourOfHerorsApi.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepo extends JpaRepository<Hero, Long> {

    void deleteHeroById(Long id);

    Hero findAllByHeroName(String heroName);
}
