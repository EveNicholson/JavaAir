package org.example;

import org.example.Rank;

public class Pilot {
    private final String name;
    private final Rank rank;
    private final String pilotLicenseNumber;

    public Pilot(String name, Rank rank, String pilotLicenseNumber) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public String flyPlane() {
        return "Pilot " + name + " is flying the plane.";
    }
}
