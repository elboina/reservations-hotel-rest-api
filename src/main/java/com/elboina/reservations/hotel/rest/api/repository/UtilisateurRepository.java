/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.repository;

import com.elboina.reservations.hotel.rest.api.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Moi
 */
@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
    public Utilisateur findByIdentifiantAndMotDePasse(String identifiant, String motDePasse);
    
}
