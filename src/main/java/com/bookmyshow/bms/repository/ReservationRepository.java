package com.bookmyshow.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookmyshow.bms.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}