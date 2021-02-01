package Modelpkg;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class Partitions {

    private  Integer instorey_id;
    private String instorey_name;

    //Many partitions belong to a Storey in Building
    @ManyToOne
    private Storey storey;

    //A Partition in Storey can hav many rooms
    @OneToMany
    private List<Rooms> rooms;
}
