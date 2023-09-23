package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Pilot pilot;
    private List<CabinCrewMember> cabinCrewMembers;
    private final List<Passenger> bookedPassengers;
    private final PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, List<CabinCrewMember> cabinCrewMembers, PlaneType planeType,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.bookedPassengers = new ArrayList<>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getAvailableSeats() {
        return planeType.getCapacity() - bookedPassengers.size();
    }

    public boolean bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
            return true;
        }
        return false;
    }
}
