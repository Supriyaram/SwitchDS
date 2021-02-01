

package Modelpkg;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

public class Buildings {
        private Integer buildings_id;
        private String buildings_name;
        private String  buildings_street;
        private String buildings_pincode;


        //Buildings and User Association
        @ManyToOne
        private User user;


        //Buildings and Rooms Association
        @ManyToMany
        private List<Rooms> rooms;



    }

