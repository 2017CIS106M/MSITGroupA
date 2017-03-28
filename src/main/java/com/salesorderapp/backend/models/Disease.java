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
@Table(name = "disease")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Disease implements Serializable {

  @Id
  private String disease_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  public Disease() { }

  public String getDisease_cd() {
    return disease_cd;
  }

  public void setDisease_cd(String disease_cd) {
    this.disease_cd = disease_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
