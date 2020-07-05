package arkham.knight.bad.controllers;

import arkham.knight.bad.services.DeathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/death")
public class DeathController {

    @Autowired
    private DeathService deathService;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("deaths", deathService.getAllDeaths());

        return "freemarker/cast";
    }
}
