package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiseaseSymptomsKey implements Serializable{

  @Column(name = "disease_cd")
  private String disease_cd;

  @Column(name = "symptoms_cd")
  private String symptoms_cd;

  public String getDisease_cd() {
    return disease_cd;
  }

  public void setDisease_cd(String disease_cd) {
    this.disease_cd = disease_cd;
  }

  public String getSymptoms_cd() {
    return symptoms_cd;
  }

  public void setSymptoms_cd(String symptoms_cd) {
    this.symptoms_cd = symptoms_cd;
  }
}
