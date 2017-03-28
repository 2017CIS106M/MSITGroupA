package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "disease_symptoms")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrugDisease implements Serializable {

  @EmbeddedId
  private DrugDiseaseKey key;

  public DrugDiseaseKey getKey() {
    return key;
  }

  public void setKey(DrugDiseaseKey key) {
    this.key = key;
  }
}
