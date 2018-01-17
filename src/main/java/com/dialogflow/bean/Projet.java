/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.util.Date;

public class Projet implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Long id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Size( max = 100 )
    private String libelle;

    @Size( max = 200 )
    private String description;


    private Integer villeProjet;


    private Date dateCreation;


    private Date dateMaj;

    @Size( max = 30 )
    private String codeProjet;

    @Size( max = 50 )
    private String sequenceProjet;

    @Size( max = 200 )
    private String sequenceVente;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Long id ) {
        this.id = id ;
    }

    public Long getId() {
        return this.id;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setLibelle( String libelle ) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return this.libelle;
    }

    public void setDescription( String description ) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setVilleProjet( Integer villeProjet ) {
        this.villeProjet = villeProjet;
    }
    public Integer getVilleProjet() {
        return this.villeProjet;
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

    public void setCodeProjet( String codeProjet ) {
        this.codeProjet = codeProjet;
    }
    public String getCodeProjet() {
        return this.codeProjet;
    }

    public void setSequenceProjet( String sequenceProjet ) {
        this.sequenceProjet = sequenceProjet;
    }
    public String getSequenceProjet() {
        return this.sequenceProjet;
    }

    public void setSequenceVente( String sequenceVente ) {
        this.sequenceVente = sequenceVente;
    }
    public String getSequenceVente() {
        return this.sequenceVente;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(libelle);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(villeProjet);
        sb.append("|");
        sb.append(dateCreation);
        sb.append("|");
        sb.append(dateMaj);
        sb.append("|");
        sb.append(codeProjet);
        sb.append("|");
        sb.append(sequenceProjet);
        sb.append("|");
        sb.append(sequenceVente);
        return sb.toString(); 
    } 


}
