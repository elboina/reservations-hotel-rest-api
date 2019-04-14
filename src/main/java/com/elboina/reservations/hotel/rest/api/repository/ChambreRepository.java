/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.repository;

import com.elboina.reservations.hotel.rest.api.entity.Chambre;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Moi
 */
@Repository
public interface ChambreRepository extends CrudRepository<Chambre, Long> {
    
    @Query("SELECT c FROM Chambre c JOIN c.hotel h WHERE h.adresse.localite = ?1 AND c.nbPersonnes = ?2 EXCEPT SELECT c FROM Chambre c JOIN c.reservations r WHERE r.dateCheckOut >= ?3 AND r.dateCheckIn <= ?4")
    public ArrayList<Chambre> findByLocaliteNbPersonnesGreaterThanAndDisponibilité(String localite, Integer nbPersonnes, Date dateDebut, Date dateFin);
}
