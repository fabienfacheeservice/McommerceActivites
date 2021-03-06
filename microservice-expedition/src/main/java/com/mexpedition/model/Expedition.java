package com.mexpedition.model;

import javax.persistence.*;

@Entity
@Table(name="Expedition")
public class Expedition {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer idCommande;

    private Integer etat;

    public Expedition() {
    }

    public Expedition(Integer id, Integer idCommande, Integer etat) {
        this.id = id;
        this.idCommande = idCommande;
        this.etat = etat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Expedition{" +
                "id=" + id +
                ", idCommande=" + idCommande +
                ", etat=" + etat +
                '}';
    }
}
