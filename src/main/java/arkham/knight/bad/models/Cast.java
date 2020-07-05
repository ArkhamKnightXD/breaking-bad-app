package arkham.knight.bad.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cast {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String birthday;

    // Cuando un json tenga arreglos debo de utilizar el @elementcollection para poder utilizar listas y por lo tanto poder guardar los datos del arreglo que esta en el json en mi
    //base de datos que creara otra tabla que la relaccionara con esta clase
    @ElementCollection
    private List<String> occupation;

    @Column(length = 300)
    private String img;

    private String status;
    private String nickname;

    @ElementCollection
    private List<Integer> appearance;

    private String portrayed;
    private String category;


    public Cast() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getOccupation() {
        return occupation;
    }

    public void setOccupation(List<String> occupation) {
        this.occupation = occupation;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Integer> getAppearance() {
        return appearance;
    }

    public void setAppearance(List<Integer> appearance) {
        this.appearance = appearance;
    }

    public String getPortrayed() {
        return portrayed;
    }

    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
