package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Blob;

@Entity
@Table(name = "user_drug_search")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDrugSearch implements Serializable {

  @Id
  private Integer drug_name;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "brand_name")
  private String brand_name;

  @Column(name = "drug_dosage")
  private String drug_dosage;

  @Column(name = "drug_indication")
  private String drug_indication;

  @Column(name = "price")
  private String price;

  @Column(name = "photo")
  private Blob photo;

  @Column(name = "symptoms")
  private String symptoms;

  @Column(name = "stores")
  private String stores;

  @Column(name = "user_drug_searchcol")
  private String user_drug_searchcol;

  public UserDrugSearch() { }

  public Integer getDrug_name() {
    return drug_name;
  }

  public void setDrug_name(Integer drug_name) {
    this.drug_name = drug_name;
  }

  public String getBrand_name() {
    return brand_name;
  }

  public void setBrand_name(String brand_name) {
    this.brand_name = brand_name;
  }

  public String getDrug_dosage() {
    return drug_dosage;
  }

  public void setDrug_dosage(String drug_dosage) {
    this.drug_dosage = drug_dosage;
  }

  public String getDrug_indication() {
    return drug_indication;
  }

  public void setDrug_indication(String drug_indication) {
    this.drug_indication = drug_indication;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Blob getPhoto() {
    return photo;
  }

  public void setPhoto(Blob photo) {
    this.photo = photo;
  }

  public String getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(String symptoms) {
    this.symptoms = symptoms;
  }

  public String getStores() {
    return stores;
  }

  public void setStores(String stores) {
    this.stores = stores;
  }

  public String getUser_drug_searchcol() {
    return user_drug_searchcol;
  }

  public void setUser_drug_searchcol(String user_drug_searchcol) {
    this.user_drug_searchcol = user_drug_searchcol;
  }
}
