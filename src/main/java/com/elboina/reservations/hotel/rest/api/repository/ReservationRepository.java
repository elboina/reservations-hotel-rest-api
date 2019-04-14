/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.repository;

import com.elboina.reservations.hotel.rest.api.entity.Reservation;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Moi
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    public List<Reservation> findByClientIdAndEtatReservation(Long idClient, Reservation.EtatReservation etatReservation);
    
}
