/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Moi
 */
@Entity
public class Utilisateur implements Serializable {
    
    
    public enum TypeUtilisateur {
    ADMIN,
    CLIENT
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String identifiant;
    
    private String motDePasse;
    
    private String email;
    
    @Enumerated(EnumType.STRING)
    private TypeUtilisateur typeUtilisateur;
    
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeUtilisateur getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(
            TypeUtilisateur typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(
            Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        
        return this.id != null && this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return "com.elboina.reservations.hotel.rest.api.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
