package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "drug")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Drug implements Serializable {

  @Id
  private String drug_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "indication")
  private String indication;

  @Column(name = "dosageanddirections")
  private String dosageanddirections;

  @Column(name = "contraindications")
  private String contraindications;

  @Column(name = "specialprecautions")
  private String specialprecautions;

  @Column(name = "sideeffects")
  private String sideeffects;

  @Column(name = "interactions")
  private String interactions;

  @Column(name = "pregnacysafety")
  private String pregnacysafety;

  @Column(name = "brand_cd")
  private String brand_cd;

  @Column(name = "manufacturer_cd")
  private String manufacturer_cd;

  @Column(name = "distributor_cd")
  private String distributor_cd;

  public Drug() { }

  public String getDrug_cd() {
    return drug_cd;
  }

  public void setDrug_cd(String drug_cd) {
    this.drug_cd = drug_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIndication() {
    return indication;
  }

  public void setIndication(String indication) {
    this.indication = indication;
  }

  public String getDosageanddirections() {
    return dosageanddirections;
  }

  public void setDosageanddirections(String dosageanddirections) {
    this.dosageanddirections = dosageanddirections;
  }

  public String getContraindications() {
    return contraindications;
  }

  public void setContraindications(String contraindications) {
    this.contraindications = contraindications;
  }

  public String getSpecialprecautions() {
    return specialprecautions;
  }

  public void setSpecialprecautions(String specialprecautions) {
    this.specialprecautions = specialprecautions;
  }

  public String getSideeffects() {
    return sideeffects;
  }

  public void setSideeffects(String sideeffects) {
    this.sideeffects = sideeffects;
  }

  public String getInteractions() {
    return interactions;
  }

  public void setInteractions(String interactions) {
    this.interactions = interactions;
  }

  public String getPregnacysafety() {
    return pregnacysafety;
  }

  public void setPregnacysafety(String pregnacysafety) {
    this.pregnacysafety = pregnacysafety;
  }

  public String getBrand_cd() {
    return brand_cd;
  }

  public void setBrand_cd(String brand_cd) {
    this.brand_cd = brand_cd;
  }

  public String getManufacturer_cd() {
    return manufacturer_cd;
  }

  public void setManufacturer_cd(String manufacturer_cd) {
    this.manufacturer_cd = manufacturer_cd;
  }

  public String getDistributor_cd() {
    return distributor_cd;
  }

  public void setDistributor_cd(String distributor_cd) {
    this.distributor_cd = distributor_cd;
  }
}
