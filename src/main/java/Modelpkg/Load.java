package Modelpkg;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

public class Load {

    private  Integer load_id;
    private String load_name;
    private String load_type;



    //Mnay loads in same room belongs to a room
    @ManyToOne
    private List<Rooms> rooms;

    //One load is assigned with one switch
    @OneToOne
    private List<Switches>switches;


}
