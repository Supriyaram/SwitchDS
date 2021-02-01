package Modelpkg;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;

public class Load {

    private  Integer load_id;
    private String load_name;
    private String load_type;


    //Load and Rooms Association
    @ManyToMany
    private List<Rooms> rooms;

    //Load and Switches Association
    @ManyToMany
    private List<Switches>switches;


}
