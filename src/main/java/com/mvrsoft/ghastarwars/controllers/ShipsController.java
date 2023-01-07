package com.mvrsoft.ghastarwars.controllers;

import org.springframework.stereotype.Controller;

import com.mvrsoft.ghastarwars.model.StarShip;

@Controller
public class ShipsController {
    
    public StarShip getStarShip() {
        StarShip starShip = new StarShip();
        starShip.setName("Death Star");
        starShip.setModel("DS1 Orbital Battle Station");
        return starShip;
    }
}
