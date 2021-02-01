package Modelpkg;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class Storey {

    private Integer Storey_id;

    //Many  Storeys belongs to a Building
    @ManyToOne
    private Buildings buildings;

    //A Storey in building  has many partitions
    @OneToMany
    private List<Partitions> partitions;
}
