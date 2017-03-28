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
@Table(name = "symptoms")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Symptoms implements Serializable {

  @Id
  private String symptoms_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  public Symptoms() { }

  public String getSymptoms_cd() {
    return symptoms_cd;
  }

  public void setSymptoms_cd(String symptoms_cd) {
    this.symptoms_cd = symptoms_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
