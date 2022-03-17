/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.bean;

/**
 *
 * @author yacou.kone
 */
public class OperationT24 {
    //{"total":"1","data":[{"date":"20180509","reference_alternative":"1000008","reference_T24":"FT1812918QY2","nom":"DOSSO","prenom":"YLYASSE"}]}
    private String dateOper;
    private String reference_alternative;
    private String reference_T24;
    private String nom;
    private String prenom;
    private int nbEssai=1;
    private String statut="N";
    private String fichier;
    
    public OperationT24(){}

    public String getDateOper() {
        return dateOper;
    }

    public void setDateOper(String dateOper) {
        this.dateOper = dateOper;
    }

    public String getReference_alternative() {
        return reference_alternative;
    }

    public void setReference_alternative(String reference_alternative) {
        this.reference_alternative = reference_alternative;
    }

    public String getReference_T24() {
        return reference_T24;
    }

    public void setReference_T24(String reference_T24) {
        this.reference_T24 = reference_T24;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbEssai() {
        return nbEssai;
    }

    public void setNbEssai(int nbEssai) {
        this.nbEssai = nbEssai;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }
    
    
     
    
}
