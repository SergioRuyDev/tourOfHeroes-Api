package com.tourOfHerorsApi.repository;

import com.tourOfHerorsApi.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepo extends JpaRepository<Hero, Long> {

}
