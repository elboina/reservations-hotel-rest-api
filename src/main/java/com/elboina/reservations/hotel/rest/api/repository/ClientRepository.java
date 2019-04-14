/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.repository;

import com.elboina.reservations.hotel.rest.api.entity.Client;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Moi
 */
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    @Query("SELECT c From Client c ORDER BY c.nom, c.prenom")
    public List<Client>findAllClientsOrderedByNomAndPrenom();    
}
