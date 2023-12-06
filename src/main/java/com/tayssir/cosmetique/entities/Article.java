package com.tayssir.cosmetique.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idarticle;
    private String nomarticle;
    private Double prixarticle;
    private Date dateCreation;
   
    @ManyToOne
    @JoinColumn(name = "classification_id_clas")
    private Classification classification;

    public Article() {
        super();
    }

    public Article(String nomarticle, Double prixarticle, Date dateCreation) {
        super();
        this.nomarticle = nomarticle;
        this.prixarticle = prixarticle;
        this.dateCreation = dateCreation;
    }

    public Long getIdarticle() {
        return idarticle;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public void setIdarticle(Long idarticle) {
        this.idarticle = idarticle;
    }

    public String getNomarticle() {
        return nomarticle;
    }

    public void setNomarticle(String nomarticle) {
        this.nomarticle = nomarticle;
    }

    public Double getPrixarticle() {
        return prixarticle;
    }

    public void setPrixarticle(Double prixarticle) {
        this.prixarticle = prixarticle;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Article [idarticle=" + idarticle + ", nomarticle=" + nomarticle + ", prixarticle=" + prixarticle
                + ", dateCreation=" + dateCreation + "]";
    }
}
