package arkham.knight.bad.controllers;

import arkham.knight.bad.services.CastService;
import arkham.knight.bad.services.DeathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cast")
public class CastController {

    @Autowired
    private CastService castService;

    @Autowired
    private DeathService deathService;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("casts", castService.getAllCast());

        return "freemarker/cast";
    }


    @RequestMapping("/murder/{killerName}")
    public String peopleKillByTheCharacter(Model model, @PathVariable("killerName") String killerName){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("deaths", deathService.getAllDeathsByResponsible(killerName));
        model.addAttribute("deathCharacters", castService.getAllDeathsCharactersByKillerName(killerName));

        return "freemarker/deaths";
    }
}
