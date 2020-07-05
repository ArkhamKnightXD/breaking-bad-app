package arkham.knight.bad.controllers;

import arkham.knight.bad.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quote")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("quotes", quoteService.getAllQuotes());

        return "freemarker/cast";
    }
}
