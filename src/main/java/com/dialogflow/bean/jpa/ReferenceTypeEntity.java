/*
 * Created on 16 janv. 2018 ( Time 22:11:41 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.dialogflow.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "REFERENCE_TYPE"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="REFERENCE_TYPE", schema="USERIMMO" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ReferenceTypeEntity.countAll", query="SELECT COUNT(x) FROM ReferenceTypeEntity x" )
} )
public class ReferenceTypeEntity implements Serializable {

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



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="referenceType", targetEntity=ReferenceEntity.class)
    private List<ReferenceEntity> listOfReference;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ReferenceTypeEntity() {
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


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfReference( List<ReferenceEntity> listOfReference ) {
        this.listOfReference = listOfReference;
    }
    public List<ReferenceEntity> getListOfReference() {
        return this.listOfReference;
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
        return sb.toString(); 
    } 

}
