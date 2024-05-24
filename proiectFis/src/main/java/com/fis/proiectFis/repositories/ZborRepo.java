package com.fis.proiectFis.repositories;

import com.fis.proiectFis.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZborRepo extends JpaRepository<Flight,Integer> {
}
