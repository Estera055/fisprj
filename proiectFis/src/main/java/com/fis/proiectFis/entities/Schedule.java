package com.fis.proiectFis.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    private List<String> operatingDays;

    public Schedule(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    public Schedule() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", operatingDays=" + operatingDays +
                '}';
    }
}
