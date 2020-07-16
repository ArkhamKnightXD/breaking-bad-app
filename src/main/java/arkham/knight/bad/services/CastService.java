package arkham.knight.bad.services;

import arkham.knight.bad.models.Cast;
import arkham.knight.bad.models.Death;
import arkham.knight.bad.repositories.CastRepository;
import arkham.knight.bad.repositories.DeathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;

    @Autowired
    private DeathRepository deathRepository;


    public List<Cast> getAllCast(){

        return castRepository.findAll();
    }


    public Cast findCastByName(String castName){

        return castRepository.findByName(castName);
    }


    public List<Cast> getAllCastByNameLike(String castName){

        return castRepository.findByNameLike("%" + castName + "%");
    }


    public List<Cast> getAllDeathsCharactersByKillerName(String responsibleOfTheDeath){

        List<Cast> castOfDeaths = new ArrayList<>();

        for (Death death : deathRepository.findAllByResponsibleLike("%" +responsibleOfTheDeath +"%")) {

            Cast deathCast = castRepository.findByName(death.getDeath());

            castOfDeaths.add(deathCast);
        }

        return castOfDeaths;
    }


    public void saveAllCast(ResponseEntity<Cast[]> responseEntity){

        List<Cast> castList = Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));

        castRepository.saveAll(castList);
    }
}
