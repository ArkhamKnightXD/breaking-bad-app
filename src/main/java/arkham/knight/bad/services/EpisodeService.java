package arkham.knight.bad.services;

import arkham.knight.bad.models.Episode;
import arkham.knight.bad.repositories.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;


    public List<Episode> getAllEpisodes(){

        return episodeRepository.findAll();
    }


    public List<Episode> getAllEpisodesByTitleLike(String title){

        return episodeRepository.findAllByTitleLike("%" + title + "%");
    }


    public void saveAllEpisodes(ResponseEntity<Episode[]> responseEntity){

        List<Episode> episodeList = Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));

        episodeRepository.saveAll(episodeList);
    }
}
