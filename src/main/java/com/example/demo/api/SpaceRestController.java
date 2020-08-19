package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceRestController {

    @GetMapping(value="/api/spaceship", produces = "application/x-protobuf")
    public SpacShipProtos.SpaceShip ship() {
        return SpacShipProtos.SpaceShip.newBuilder()
                .setCaptain("Mike")
                .setCargo(SpacShipProtos.SpaceShip.CargoType.FRUIT)
                .setModel("Pyramid")
                .setFuel(88)
                .build();
    }
}
