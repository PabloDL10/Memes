package com.cebem.RickandMorty.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cebem.RickandMorty.models.CharactersModel;
import com.cebem.RickandMorty.services.RickAndMortyService;

@Controller
public class WebController {
@Autowired
RickAndMortyService rickAndMortyService2;

    @RequestMapping("/rickandmorty/allTemplate")
    public String charactersTemplate(Model modelo){
        CharactersModel charactersModel = rickAndMortyService2.getAllCharacters();

        modelo.addAttribute("creator", "Creado por Angel");
        modelo.addAttribute("characters", charactersModel.results);
        return "rickandmortyall";
  }
    
}
