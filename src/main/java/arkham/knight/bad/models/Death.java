package arkham.knight.bad.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Death {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String death;
    private String cause;
    private String responsible;
    private String last_words;
    private int season;
    private int episode;
    private int number_of_deaths;


    public Death() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getLast_words() {
        return last_words;
    }

    public void setLast_words(String last_words) {
        this.last_words = last_words;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) { this.season = season; }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getNumber_of_deaths() { return number_of_deaths; }

    public void setNumber_of_deaths(int number_of_deaths) {
        this.number_of_deaths = number_of_deaths;
    }
}
