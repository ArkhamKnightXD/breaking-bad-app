package arkham.knight.bad;

import arkham.knight.bad.models.Cast;
import arkham.knight.bad.models.Death;
import arkham.knight.bad.models.Episode;
import arkham.knight.bad.models.Quote;
import arkham.knight.bad.services.CastService;
import arkham.knight.bad.services.DeathService;
import arkham.knight.bad.services.EpisodeService;
import arkham.knight.bad.services.QuoteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BadApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate, CastService castService, QuoteService quoteService, DeathService deathService, EpisodeService episodeService) {
        return args -> {

          /*  ResponseEntity<Episode[]> responseEntityEpisode = restTemplate.getForEntity("https://breakingbadapi.com/api/episodes", Episode[].class);

            ResponseEntity<Cast[]> responseEntity = restTemplate.getForEntity("https://breakingbadapi.com/api/characters", Cast[].class);

            ResponseEntity<Quote[]> responseEntityQuotes = restTemplate.getForEntity("https://breakingbadapi.com/api/quotes", Quote[].class);

            ResponseEntity<Death[]> responseEntityDeaths = restTemplate.getForEntity("https://breakingbadapi.com/api/deaths", Death[].class);


            episodeService.saveAllEpisodes(responseEntityEpisode);

            castService.saveAllCast(responseEntity);

            quoteService.saveAllQuotes(responseEntityQuotes);

            deathService.saveAllDeaths(responseEntityDeaths); */
        };
    }

}
