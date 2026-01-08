package web.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Cars {
    @Id
    @GeneratedValue()
    private Long id;
    private String model;
    private String color;

}
