package com.tourOfHerorsApi.service;

import com.tourOfHerorsApi.model.Heroes;
import com.tourOfHerorsApi.repository.HeroesRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HeroesService {

    public HeroesRepo heroesRepo;

    public List<Heroes> getHeroes() {
        return heroesRepo.findAll();
    }

    public  Heroes getById
}
