package arkham.knight.bad.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cast {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String birthday;

    @Column(length = 300)
    private String img;

    private String status;
    private String portrayed;
    private String category;


    public Cast() {
    }


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBirthday() { return birthday; }

    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getImg() { return img; }

    public void setImg(String img) { this.img = img; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getPortrayed() { return portrayed; }

    public void setPortrayed(String portrayed) { this.portrayed = portrayed; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }
}
