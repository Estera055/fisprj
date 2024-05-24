package com.fis.proiectFis.entities;
import com.fis.proiectFis.entities.Flight;

import jakarta.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passengerName;
    private String seatClass; // Economy, Business, First Class
    private int seatNumber;
    private double price;
    private boolean isRoundTrip;
    private boolean isLastMinute;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    String orasPlecare = flight.getOrasdus();
    String orasDestinatie = flight.getOrasintors();

    public Reservation(String passengerName, String seatClass, int seatNumber, double price, boolean isRoundTrip, boolean isLastMinute) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isRoundTrip = isRoundTrip;
        this.isLastMinute = isLastMinute;
    }

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRoundTrip() {
        return isRoundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        isRoundTrip = roundTrip;
    }

    public boolean isLastMinute() {
        return isLastMinute;
    }

    public void setLastMinute(boolean lastMinute) {
        isLastMinute = lastMinute;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", passengerName='" + passengerName + '\'' +
                ", seatClass='" + seatClass + '\'' +
                ", seatNumber=" + seatNumber +
                ", price=" + price +
                ", isRoundTrip=" + isRoundTrip +
                ", isLastMinute=" + isLastMinute +
                ", flight=" + flight +
                '}';
    }
}
