package arkham.knight.bad.controllers;

import arkham.knight.bad.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/episode")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;


    @RequestMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "") String title){

        model.addAttribute("title","Welcome to the breaking bad web");
        model.addAttribute("episodes", episodeService.getAllEpisodes());
        model.addAttribute("episodes", episodeService.getAllEpisodesByTitleLike(title));

        return "freemarker/episode";
    }
}
