package web.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Cars {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    public Cars(){

    }

    public Cars(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
