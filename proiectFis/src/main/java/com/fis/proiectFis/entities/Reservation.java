package com.fis.proiectFis.entities;

import jakarta.persistence.*;
import com.fis.proiectFis.entities.Flight;
import java.time.LocalDate;

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
    private LocalDate date1;
    private LocalDate date2;//valabil DOAR pentru cursele dus-intors(mai exact orasul intors)
    private int numberofPassengers;
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private String orasPlecare;
    private String orasDestinatie;


    public Reservation() {

    }

    public int getNumberofPassengers() {
        return numberofPassengers;
    }

    public void setNumberofPassengers(int numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }

    public Reservation(int id, String passengerName, String seatClass, int seatNumber, double price, boolean isRoundTrip, boolean isLastMinute, LocalDate date1, LocalDate date2, int numberofPassengers, Flight flight, String orasPlecare, String orasDestinatie) {
        this.id = id;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isRoundTrip = isRoundTrip;
        this.isLastMinute = isLastMinute;
        this.date1 = date1;
        this.date2 = date2;
        this.numberofPassengers = numberofPassengers;
        this.flight = flight;
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = orasDestinatie;
    }

    public LocalDate getDate1() {
        return date1;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }

    public LocalDate getDate2() {
        return date2;
    }

    public void setDate2(LocalDate date2) {
        this.date2 = date2;
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

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }
// Other constructors, getters, setters, and methods...
}