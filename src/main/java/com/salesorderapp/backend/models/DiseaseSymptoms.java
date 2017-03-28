package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "disease_symptoms")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiseaseSymptoms implements Serializable {

  @EmbeddedId
  private DiseaseSymptomsKey key;

  public DiseaseSymptomsKey getKey() {
    return key;
  }

  public void setKey(DiseaseSymptomsKey key) {
    this.key = key;
  }
}
