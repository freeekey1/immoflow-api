/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.bean;

import java.io.Serializable;

import javax.validation.constraints.*;


public class Reference implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    private Integer refTypeReference;

    @Size( max = 100 )
    private String libelle;


    private Integer ordre;


    private Integer refProjet;



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
    public void setRefTypeReference( Integer refTypeReference ) {
        this.refTypeReference = refTypeReference;
    }
    public Integer getRefTypeReference() {
        return this.refTypeReference;
    }

    public void setLibelle( String libelle ) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return this.libelle;
    }

    public void setOrdre( Integer ordre ) {
        this.ordre = ordre;
    }
    public Integer getOrdre() {
        return this.ordre;
    }

    public void setRefProjet( Integer refProjet ) {
        this.refProjet = refProjet;
    }
    public Integer getRefProjet() {
        return this.refProjet;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(refTypeReference);
        sb.append("|");
        sb.append(libelle);
        sb.append("|");
        sb.append(ordre);
        sb.append("|");
        sb.append(refProjet);
        return sb.toString(); 
    } 


}