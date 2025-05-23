package com.cruzerick.reservations.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "origin", nullable = false, length = 3)
    private String origin;

    @Column(name = "destination", nullable = false, length = 3)
    private String destination;

    @Column(name = "departure", nullable = false)
    private String departure;

    @Column(name = "arrival", nullable = false)
    private String arrival;

    @Column(name = "carrier", nullable = false, length = 3)
    private String carrier;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return Objects.equals(id, segment.id) && Objects.equals(origin, segment.origin) && Objects.equals(destination, segment.destination) && Objects.equals(departure, segment.departure) && Objects.equals(arrival, segment.arrival) && Objects.equals(carrier, segment.carrier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, origin, destination, departure, arrival, carrier);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", carrier='" + carrier + '\'' +
                '}';
    }
}
