package com.mvrsoft.ghastarwars.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mvrsoft.ghastarwars.model.StarShip;

public class TestStarShipService {

    @Test
    public void testConfig() throws Exception{
        //Given
        StarShip deathStar = new StarShip();
        
        //When
        deathStar.setName("Death Star");
        deathStar.setModel("DS-1 Orbital Battle Station");
        System.out.println ("Starship = " + deathStar);

        //Then
        assertNotNull(deathStar);
    }
}
