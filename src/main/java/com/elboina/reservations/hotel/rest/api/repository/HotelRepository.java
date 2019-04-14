/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.repository;

import com.elboina.reservations.hotel.rest.api.entity.Hotel;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Moi
 */
@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
    public Hotel findByCodeHotel(String codeHotel);
    public ArrayList<Hotel> findByAdresseLocalite(String localite);
}
