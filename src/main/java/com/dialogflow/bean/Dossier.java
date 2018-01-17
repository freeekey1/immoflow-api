/*
 * Created on 16 janv. 2018 ( Time 22:40:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.util.Date;

public class Dossier implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    private Integer refBien;

    @Size( max = 100 )
    private String commercial;

    @Size( max = 100 )
    private String etat;


    private Integer refProjet;


    private Integer refTranche;


    private Integer typeDesistement;


    private Date dateDesistement;

    @Size( max = 100 )
    private String numDossDoc;


    private Integer refConvention;


    private Long numVenteProjet;


    private Date dateCreation;


    private Date dateMaj;


    private Date dateFacturation;


    private Float fraisDossier;


    private Date dateActeLegalise;


    private Date dateActeEnvoye;


    private Date dateActeSigne;


    private Date dateActeRemis;


    private Date dateFraisDossier;


    private Integer refTypeRecouvrement;


    private Date dateCompSignCli;


    private Date dateCompSignProm;


    private Date dateRemisCompCli;


    private Date dateContSignCli;


    private Date dateContSignProm;


    private Date dateRemisCle;

    @Size( max = 500 )
    private String observation;


    private Integer refNotaire;


    private Date dossierEnvoye;


    private Long syndicMnt;


    private Date syndicDate;


    private Date dossierEnvoyer;



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
    public void setRefBien( Integer refBien ) {
        this.refBien = refBien;
    }
    public Integer getRefBien() {
        return this.refBien;
    }

    public void setCommercial( String commercial ) {
        this.commercial = commercial;
    }
    public String getCommercial() {
        return this.commercial;
    }

    public void setEtat( String etat ) {
        this.etat = etat;
    }
    public String getEtat() {
        return this.etat;
    }

    public void setRefProjet( Integer refProjet ) {
        this.refProjet = refProjet;
    }
    public Integer getRefProjet() {
        return this.refProjet;
    }

    public void setRefTranche( Integer refTranche ) {
        this.refTranche = refTranche;
    }
    public Integer getRefTranche() {
        return this.refTranche;
    }

    public void setTypeDesistement( Integer typeDesistement ) {
        this.typeDesistement = typeDesistement;
    }
    public Integer getTypeDesistement() {
        return this.typeDesistement;
    }

    public void setDateDesistement( Date dateDesistement ) {
        this.dateDesistement = dateDesistement;
    }
    public Date getDateDesistement() {
        return this.dateDesistement;
    }

    public void setNumDossDoc( String numDossDoc ) {
        this.numDossDoc = numDossDoc;
    }
    public String getNumDossDoc() {
        return this.numDossDoc;
    }

    public void setRefConvention( Integer refConvention ) {
        this.refConvention = refConvention;
    }
    public Integer getRefConvention() {
        return this.refConvention;
    }

    public void setNumVenteProjet( Long numVenteProjet ) {
        this.numVenteProjet = numVenteProjet;
    }
    public Long getNumVenteProjet() {
        return this.numVenteProjet;
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

    public void setDateFacturation( Date dateFacturation ) {
        this.dateFacturation = dateFacturation;
    }
    public Date getDateFacturation() {
        return this.dateFacturation;
    }

    public void setFraisDossier( Float fraisDossier ) {
        this.fraisDossier = fraisDossier;
    }
    public Float getFraisDossier() {
        return this.fraisDossier;
    }

    public void setDateActeLegalise( Date dateActeLegalise ) {
        this.dateActeLegalise = dateActeLegalise;
    }
    public Date getDateActeLegalise() {
        return this.dateActeLegalise;
    }

    public void setDateActeEnvoye( Date dateActeEnvoye ) {
        this.dateActeEnvoye = dateActeEnvoye;
    }
    public Date getDateActeEnvoye() {
        return this.dateActeEnvoye;
    }

    public void setDateActeSigne( Date dateActeSigne ) {
        this.dateActeSigne = dateActeSigne;
    }
    public Date getDateActeSigne() {
        return this.dateActeSigne;
    }

    public void setDateActeRemis( Date dateActeRemis ) {
        this.dateActeRemis = dateActeRemis;
    }
    public Date getDateActeRemis() {
        return this.dateActeRemis;
    }

    public void setDateFraisDossier( Date dateFraisDossier ) {
        this.dateFraisDossier = dateFraisDossier;
    }
    public Date getDateFraisDossier() {
        return this.dateFraisDossier;
    }

    public void setRefTypeRecouvrement( Integer refTypeRecouvrement ) {
        this.refTypeRecouvrement = refTypeRecouvrement;
    }
    public Integer getRefTypeRecouvrement() {
        return this.refTypeRecouvrement;
    }

    public void setDateCompSignCli( Date dateCompSignCli ) {
        this.dateCompSignCli = dateCompSignCli;
    }
    public Date getDateCompSignCli() {
        return this.dateCompSignCli;
    }

    public void setDateCompSignProm( Date dateCompSignProm ) {
        this.dateCompSignProm = dateCompSignProm;
    }
    public Date getDateCompSignProm() {
        return this.dateCompSignProm;
    }

    public void setDateRemisCompCli( Date dateRemisCompCli ) {
        this.dateRemisCompCli = dateRemisCompCli;
    }
    public Date getDateRemisCompCli() {
        return this.dateRemisCompCli;
    }

    public void setDateContSignCli( Date dateContSignCli ) {
        this.dateContSignCli = dateContSignCli;
    }
    public Date getDateContSignCli() {
        return this.dateContSignCli;
    }

    public void setDateContSignProm( Date dateContSignProm ) {
        this.dateContSignProm = dateContSignProm;
    }
    public Date getDateContSignProm() {
        return this.dateContSignProm;
    }

    public void setDateRemisCle( Date dateRemisCle ) {
        this.dateRemisCle = dateRemisCle;
    }
    public Date getDateRemisCle() {
        return this.dateRemisCle;
    }

    public void setObservation( String observation ) {
        this.observation = observation;
    }
    public String getObservation() {
        return this.observation;
    }

    public void setRefNotaire( Integer refNotaire ) {
        this.refNotaire = refNotaire;
    }
    public Integer getRefNotaire() {
        return this.refNotaire;
    }

    public void setDossierEnvoye( Date dossierEnvoye ) {
        this.dossierEnvoye = dossierEnvoye;
    }
    public Date getDossierEnvoye() {
        return this.dossierEnvoye;
    }

    public void setSyndicMnt( Long syndicMnt ) {
        this.syndicMnt = syndicMnt;
    }
    public Long getSyndicMnt() {
        return this.syndicMnt;
    }

    public void setSyndicDate( Date syndicDate ) {
        this.syndicDate = syndicDate;
    }
    public Date getSyndicDate() {
        return this.syndicDate;
    }

    public void setDossierEnvoyer( Date dossierEnvoyer ) {
        this.dossierEnvoyer = dossierEnvoyer;
    }
    public Date getDossierEnvoyer() {
        return this.dossierEnvoyer;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(refBien);
        sb.append("|");
        sb.append(commercial);
        sb.append("|");
        sb.append(etat);
        sb.append("|");
        sb.append(refProjet);
        sb.append("|");
        sb.append(refTranche);
        sb.append("|");
        sb.append(typeDesistement);
        sb.append("|");
        sb.append(dateDesistement);
        sb.append("|");
        sb.append(numDossDoc);
        sb.append("|");
        sb.append(refConvention);
        sb.append("|");
        sb.append(numVenteProjet);
        sb.append("|");
        sb.append(dateCreation);
        sb.append("|");
        sb.append(dateMaj);
        sb.append("|");
        sb.append(dateFacturation);
        sb.append("|");
        sb.append(fraisDossier);
        sb.append("|");
        sb.append(dateActeLegalise);
        sb.append("|");
        sb.append(dateActeEnvoye);
        sb.append("|");
        sb.append(dateActeSigne);
        sb.append("|");
        sb.append(dateActeRemis);
        sb.append("|");
        sb.append(dateFraisDossier);
        sb.append("|");
        sb.append(refTypeRecouvrement);
        sb.append("|");
        sb.append(dateCompSignCli);
        sb.append("|");
        sb.append(dateCompSignProm);
        sb.append("|");
        sb.append(dateRemisCompCli);
        sb.append("|");
        sb.append(dateContSignCli);
        sb.append("|");
        sb.append(dateContSignProm);
        sb.append("|");
        sb.append(dateRemisCle);
        sb.append("|");
        sb.append(observation);
        sb.append("|");
        sb.append(refNotaire);
        sb.append("|");
        sb.append(dossierEnvoye);
        sb.append("|");
        sb.append(syndicMnt);
        sb.append("|");
        sb.append(syndicDate);
        sb.append("|");
        sb.append(dossierEnvoyer);
        return sb.toString(); 
    } 


}