package com.tourOfHerorsApi.repository;

import com.tourOfHerorsApi.model.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepo extends JpaRepository<Heroes, Long> {

}
