package com.mvrsoft.ghastarwars.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class StarShip {
    
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String model;

    @Getter
    @Setter
    private String starship_class;

    @Getter
    @Setter
    private String manufacturer;
    
    @Getter
    @Setter
    private String cost_in_credits;
    
    @Getter
    @Setter
    private String length;

    @Getter
    @Setter
    private String crew;

    @Getter
    @Setter
    private String passengers;

    @Getter
    @Setter
    private String max_atmosphering_speed;

    @Getter
    @Setter
    private String hyperdrive_rating;

    @Getter
    @Setter
    private String MGLT;


    @Getter
    @Setter
    private String cargo_capacity;

    @Getter
    @Setter
    private String consumables;
    // films array -- An array of Film URL Resources that this starship has appeared
    // in.
    // pilots array -- An array of People URL Resources that this starship has been
    // piloted by.
    // url string -- the hypermedia URL of this resource.
    // created string -- the ISO 8601 date format of the time that this resource was
    // created.
    // edited string -- the ISO 8601 date format of the time that this resource was
    // edited.

}
