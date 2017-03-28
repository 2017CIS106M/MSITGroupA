package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrugDiseaseKey implements Serializable {

  @Column(name = "drug_drug_cd")
  private String drug_drug_cd;

  @Column(name = "disease_disease_cd")
  private String disease_disease_cd;

  public String getDrug_drug_cd() {
    return drug_drug_cd;
  }

  public void setDrug_drug_cd(String drug_drug_cd) {
    this.drug_drug_cd = drug_drug_cd;
  }

  public String getDisease_disease_cd() {
    return disease_disease_cd;
  }

  public void setDisease_disease_cd(String disease_disease_cd) {
    this.disease_disease_cd = disease_disease_cd;
  }
}
