package Modelpkg;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;

public class Switches {

    private Integer switch_id;
    private boolean switch_state;

    //Switches and Loads Association
    @ManyToMany(mappedBy = "switches")
    private List<Load> loads;



}
