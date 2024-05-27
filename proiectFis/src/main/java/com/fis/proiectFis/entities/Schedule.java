package com.fis.proiectFis.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;

    @ElementCollection
    private List<String> operatingDays;
    private LocalDateTime ArrivalTime;
    private LocalDateTime DepartureTime;
    public Schedule(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    public Schedule() {
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public LocalDateTime getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        DepartureTime = departureTime;
    }

    public int getId() {
        return schedule_id;
    }

    public void setId(int id) {
        this.schedule_id = id;
    }

    public List<String> getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    public Schedule(int schedule_id, List<String> operatingDays, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.schedule_id = schedule_id;
        this.operatingDays = operatingDays;
        ArrivalTime = arrivalTime;
        DepartureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + schedule_id +
                ", operatingDays=" + operatingDays +
                '}';
    }
}
