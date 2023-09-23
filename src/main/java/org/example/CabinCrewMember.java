package org.example;


public class CabinCrewMember {
    private final String name;
    private final Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String relayMessage(String message) {
        return "Cabin crew member " + name + " says: " + message;
    }
}
