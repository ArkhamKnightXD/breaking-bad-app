package arkham.knight.bad.controllers;

import arkham.knight.bad.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/episode")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("episodes", episodeService.getAllEpisodes());

        return "freemarker/episode";
    }
}
