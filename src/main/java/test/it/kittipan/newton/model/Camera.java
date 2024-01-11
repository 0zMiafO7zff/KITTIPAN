package test.it.kittipan.newton.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ip_address;
    private String name;
    private String location;
    //FK
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camera")
    private List<Event> events;

    public Camera(String ip_address,String name,String location){
        this.ip_address = ip_address;
        this.name = name;
        this.location = location;
    }

}
