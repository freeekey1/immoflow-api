/*
 * Created on 16 janv. 2018 ( Time 22:40:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.util.Date;

public class DossierCredit implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    private Integer refDossier;


    private Integer refBanque;


    private Date dateDepotCredit;


    private Float montantCreditDemande;


    private Date dateDeblocCredit;


    private Float montantCreditDebloc;


    private Date dateCreation;


    private Date dateMaj;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }

    public Integer getId() {
        return this.id;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setRefDossier( Integer refDossier ) {
        this.refDossier = refDossier;
    }
    public Integer getRefDossier() {
        return this.refDossier;
    }

    public void setRefBanque( Integer refBanque ) {
        this.refBanque = refBanque;
    }
    public Integer getRefBanque() {
        return this.refBanque;
    }

    public void setDateDepotCredit( Date dateDepotCredit ) {
        this.dateDepotCredit = dateDepotCredit;
    }
    public Date getDateDepotCredit() {
        return this.dateDepotCredit;
    }

    public void setMontantCreditDemande( Float montantCreditDemande ) {
        this.montantCreditDemande = montantCreditDemande;
    }
    public Float getMontantCreditDemande() {
        return this.montantCreditDemande;
    }

    public void setDateDeblocCredit( Date dateDeblocCredit ) {
        this.dateDeblocCredit = dateDeblocCredit;
    }
    public Date getDateDeblocCredit() {
        return this.dateDeblocCredit;
    }

    public void setMontantCreditDebloc( Float montantCreditDebloc ) {
        this.montantCreditDebloc = montantCreditDebloc;
    }
    public Float getMontantCreditDebloc() {
        return this.montantCreditDebloc;
    }

    public void setDateCreation( Date dateCreation ) {
        this.dateCreation = dateCreation;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateMaj( Date dateMaj ) {
        this.dateMaj = dateMaj;
    }
    public Date getDateMaj() {
        return this.dateMaj;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(refDossier);
        sb.append("|");
        sb.append(refBanque);
        sb.append("|");
        sb.append(dateDepotCredit);
        sb.append("|");
        sb.append(montantCreditDemande);
        sb.append("|");
        sb.append(dateDeblocCredit);
        sb.append("|");
        sb.append(montantCreditDebloc);
        sb.append("|");
        sb.append(dateCreation);
        sb.append("|");
        sb.append(dateMaj);
        return sb.toString(); 
    } 


}
