package arkham.knight.bad.services;

import arkham.knight.bad.models.Death;
import arkham.knight.bad.repositories.DeathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class DeathService {

    @Autowired
    private DeathRepository deathRepository;


    public List<Death> getAllDeaths(){

        return deathRepository.findAll();
    }


    public void saveAllDeaths(ResponseEntity<Death[]> responseEntity){

        List<Death> deathList = Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));

        deathRepository.saveAll(deathList);
    }
}
