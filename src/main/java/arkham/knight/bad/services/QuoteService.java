package arkham.knight.bad.services;

import arkham.knight.bad.models.Quote;
import arkham.knight.bad.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;


    public List<Quote> getAllQuotes(){

        return quoteRepository.findAll();
    }


    public void saveAllQuotes(ResponseEntity<Quote[]> responseEntity){

        List<Quote> quoteList = Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));

        quoteRepository.saveAll(quoteList);
    }
}
