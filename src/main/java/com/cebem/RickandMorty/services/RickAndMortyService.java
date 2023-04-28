package com.cebem.RickandMorty.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.RickandMorty.models.CharacterModel;
import com.cebem.RickandMorty.models.CharactersModel;
import com.cebem.RickandMorty.utils.Utils;

@Service
public class RickAndMortyService {
    @Autowired
    RestTemplate restTemplate;

    final static String BASE_API = "https://rickandmortyapi.com/api";

    public CharacterModel getCharacterRandom(){
        final int TOTAL_CHARACTERS  = 826;
        int random = Utils.getRandomValue(TOTAL_CHARACTERS-1)+1;  // 1..826
        String url = "/character/"+random;
        //RestTemplate restTemplate = new RestTemplate();
        CharacterModel datos = restTemplate.getForObject(BASE_API+url, CharacterModel.class );
        return datos;
    }

    public CharactersModel getAllCharacters(){
        String url = "/character/";
        CharactersModel datos = restTemplate.getForObject(BASE_API+url, CharactersModel.class );
        return datos;
    }

    public int getCharactersCount(){
        String url = "/character/";
        CharactersModel datos = restTemplate.getForObject(BASE_API+url, CharactersModel.class );
        return datos.info.count;
    }

}

