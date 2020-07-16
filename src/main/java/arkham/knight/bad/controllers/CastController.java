package arkham.knight.bad.controllers;

import arkham.knight.bad.services.CastService;
import arkham.knight.bad.services.DeathService;
import arkham.knight.bad.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cast")
public class CastController {

    @Autowired
    private CastService castService;

    @Autowired
    private DeathService deathService;

    @Autowired
    private QuoteService quoteService;


    @RequestMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "") String characterName){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("casts", castService.getAllCast());
        model.addAttribute("casts", castService.getAllCastByNameLike(characterName));

        return "freemarker/cast";
    }


    @RequestMapping("/murder/{killerName}")
    public String peopleKillByTheCharacter(Model model, @PathVariable("killerName") String killerName){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("deaths", deathService.getAllDeathsByResponsible(killerName));
        model.addAttribute("deathCharacters", castService.getAllDeathsCharactersByKillerName(killerName));

        return "freemarker/deaths";
    }


    @RequestMapping("/quote/{authorName}")
    public String quotesMadeByCharacters(Model model, @PathVariable("authorName") String authorName){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("quotes", quoteService.findAllQuotesByAuthor(authorName));
        model.addAttribute("character", castService.findCastByName(authorName));
        model.addAttribute("characterName", authorName);

        return "freemarker/quotes";
    }
}
