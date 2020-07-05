package arkham.knight.bad.controllers;

import arkham.knight.bad.services.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cast")
public class CastController {

    @Autowired
    private CastService castService;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("casts", castService.getAllCast());

        return "freemarker/cast";
    }
}