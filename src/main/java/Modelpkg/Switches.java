package Modelpkg;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class Switches {

    private Integer switch_id;
    private boolean switch_state;

    //One switch is asssigned to one load
    @OneToOne
    private List<Load> loads;



}
