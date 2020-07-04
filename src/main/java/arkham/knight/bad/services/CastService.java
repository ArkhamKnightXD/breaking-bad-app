package arkham.knight.bad.services;

import arkham.knight.bad.models.Cast;
import arkham.knight.bad.repositories.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;


    public List<Cast> getAllCast(){

        return castRepository.findAll();
    }


    public void saveAllCast(ResponseEntity<Cast[]> responseEntity){

        List<Cast> castList = Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));

        castRepository.saveAll(castList);
    }
}
