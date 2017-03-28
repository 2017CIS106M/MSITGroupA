package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;

@Entity
@Table(name = "drug_form")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrugForm implements Serializable {

  @Id
  private String form;

  @Column(name = "photo")
  private Blob photo;

  @Column(name = "packing")
  private String packing;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "drug_drug_cd")
  private String drug_drug_cd;

  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public Blob getPhoto() {
    return photo;
  }

  public void setPhoto(Blob photo) {
    this.photo = photo;
  }

  public String getPacking() {
    return packing;
  }

  public void setPacking(String packing) {
    this.packing = packing;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getDrug_drug_cd() {
    return drug_drug_cd;
  }

  public void setDrug_drug_cd(String drug_drug_cd) {
    this.drug_drug_cd = drug_drug_cd;
  }
}
