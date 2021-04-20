package com.tourOfHerorsApi.repository;

import com.tourOfHerorsApi.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepo extends JpaRepository<Hero, Long> {

}
