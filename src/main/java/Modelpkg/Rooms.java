package Modelpkg;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

public class Rooms {


         private Integer room_id;
        private String room_name;

        //Rooms and Buildings Association
        @ManyToMany(mappedBy = "rooms")
        private List<Buildings> buildings;


        //Rooms and Loads Association
        @ManyToMany(mappedBy = "rooms")
        private List<Load> loads;





    }


