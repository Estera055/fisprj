package com.fis.proiectFis.repositories;

import com.fis.proiectFis.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RezervareRepo extends JpaRepository<Reservation,Integer> {
    List<Reservation> findByOrasdusAndOrasintors(String orasdus, String orasintors);


}
