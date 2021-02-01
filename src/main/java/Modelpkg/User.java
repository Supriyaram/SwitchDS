package Modelpkg;


import javax.persistence.*;
import java.util.List;



public class User {

    private Integer id;
    private String name;
    private String email;
    private String phn;


    //User and Buildings Association
    @OneToMany
    private List<Buildings> buildings;

}
