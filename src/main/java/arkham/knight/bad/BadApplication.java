package arkham.knight.bad;

import arkham.knight.bad.models.Cast;
import arkham.knight.bad.services.CastService;
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
    public CommandLineRunner run(RestTemplate restTemplate, CastService castService) {
        return args -> {

            String getAllCharactersUrl = "https://breakingbadapi.com/api/characters";

            ResponseEntity<Cast[]> responseEntity = restTemplate.getForEntity(getAllCharactersUrl, Cast[].class);

            castService.saveAllCast(responseEntity);
        };
    }

}
