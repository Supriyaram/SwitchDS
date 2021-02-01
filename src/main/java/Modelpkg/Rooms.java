package Modelpkg;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

public class Rooms {


         private Integer room_id;
        private String room_name;

        //Many rooms belong to one partition(eg.house)
        @ManyToOne
        private Partitions partitions;


        //A room has many loads
        @OneToMany
        private List<Load> loads;





    }


