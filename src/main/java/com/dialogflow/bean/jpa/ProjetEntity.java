/*
 * Created on 16 janv. 2018 ( Time 22:11:40 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.dialogflow.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "PROJET"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="PROJET", schema="USERIMMO" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ProjetEntity.countAll", query="SELECT COUNT(x) FROM ProjetEntity x" )
} )
public class ProjetEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="ID", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="LIBELLE", length=100)
    private String     libelle      ;

    @Column(name="DESCRIPTION", length=200)
    private String     description  ;

    @Column(name="VILLE_PROJET")
    private Integer    villeProjet  ;

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_CREATION")
    private Date       dateCreation ;

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_MAJ")
    private Date       dateMaj      ;

    @Column(name="CODE_PROJET", length=30)
    private String     codeProjet   ;

    @Column(name="SEQUENCE_PROJET", length=50)
    private String     sequenceProjet ;

    @Column(name="SEQUENCE_VENTE", length=200)
    private String     sequenceVente ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="projet", targetEntity=TrancheEntity.class)
    private List<TrancheEntity> listOfTranche;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ProjetEntity() {
		super();
    }
    
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
    //--- DATABASE MAPPING : LIBELLE ( VARCHAR2 ) 
    public void setLibelle( String libelle ) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return this.libelle;
    }

    //--- DATABASE MAPPING : DESCRIPTION ( VARCHAR2 ) 
    public void setDescription( String description ) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    //--- DATABASE MAPPING : VILLE_PROJET ( NUMBER ) 
    public void setVilleProjet( Integer villeProjet ) {
        this.villeProjet = villeProjet;
    }
    public Integer getVilleProjet() {
        return this.villeProjet;
    }

    //--- DATABASE MAPPING : DATE_CREATION ( DATE ) 
    public void setDateCreation( Date dateCreation ) {
        this.dateCreation = dateCreation;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }

    //--- DATABASE MAPPING : DATE_MAJ ( DATE ) 
    public void setDateMaj( Date dateMaj ) {
        this.dateMaj = dateMaj;
    }
    public Date getDateMaj() {
        return this.dateMaj;
    }

    //--- DATABASE MAPPING : CODE_PROJET ( VARCHAR2 ) 
    public void setCodeProjet( String codeProjet ) {
        this.codeProjet = codeProjet;
    }
    public String getCodeProjet() {
        return this.codeProjet;
    }

    //--- DATABASE MAPPING : SEQUENCE_PROJET ( VARCHAR2 ) 
    public void setSequenceProjet( String sequenceProjet ) {
        this.sequenceProjet = sequenceProjet;
    }
    public String getSequenceProjet() {
        return this.sequenceProjet;
    }

    //--- DATABASE MAPPING : SEQUENCE_VENTE ( VARCHAR2 ) 
    public void setSequenceVente( String sequenceVente ) {
        this.sequenceVente = sequenceVente;
    }
    public String getSequenceVente() {
        return this.sequenceVente;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfTranche( List<TrancheEntity> listOfTranche ) {
        this.listOfTranche = listOfTranche;
    }
    public List<TrancheEntity> getListOfTranche() {
        return this.listOfTranche;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
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
