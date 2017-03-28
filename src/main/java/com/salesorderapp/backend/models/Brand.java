package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "brand")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Brand implements Serializable {

  @Id
  private String brand_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "dosageordirections")
  private String dosageordirections;

  @Column(name = "administration")
  private String administration;

  @Column(name = "pregnancycategory")
  private String pregnancycategory;

  @Column(name = "interactions")
  private String interactions;

  public Brand() { }

  public String getBrand_cd() {
    return brand_cd;
  }

  public void setBrand_cd(String brand_cd) {
    this.brand_cd = brand_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDosageordirections() {
    return dosageordirections;
  }

  public void setDosageordirections(String dosageordirections) {
    this.dosageordirections = dosageordirections;
  }

  public String getAdministration() {
    return administration;
  }

  public void setAdministration(String administration) {
    this.administration = administration;
  }

  public String getPregnancycategory() {
    return pregnancycategory;
  }

  public void setPregnancycategory(String pregnancycategory) {
    this.pregnancycategory = pregnancycategory;
  }

  public String getInteractions() {
    return interactions;
  }

  public void setInteractions(String interactions) {
    this.interactions = interactions;
  }
}
