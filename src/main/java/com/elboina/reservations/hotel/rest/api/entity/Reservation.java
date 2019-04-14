/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Moi
 */
@Entity
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public enum EtatReservation {
    A_PAYER,
    PAYEE,
    ANNULEE
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String codeReservation;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCheckIn;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCheckOut;
    
    @Enumerated(EnumType.STRING)
    private EtatReservation etatReservation;
    
    @ManyToMany
    @JoinTable(name = "chambres_reservations")
    private List<Chambre> chambres = new ArrayList<>();
    
    private Double prixTotal;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getCodeReservation() {
        return codeReservation;
    }

    public void setCodeReservation(String codeReservation) {
        this.codeReservation = codeReservation;
    }

    public Date getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(Date dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public Date getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(Date dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    
    public EtatReservation getEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(
            EtatReservation etatReservation) {
        this.etatReservation = etatReservation;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(
            List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Double prixTotal) {
        this.prixTotal = prixTotal;
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
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        return (this.id != null && this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "com.elboina.reservations.hotel.rest.api.entity.Reservation[ id=" + id + " ]";
    }
    
}
