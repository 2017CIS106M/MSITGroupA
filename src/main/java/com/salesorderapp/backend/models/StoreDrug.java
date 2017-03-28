package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "store_drug")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreDrug implements Serializable {

  @EmbeddedId
  private StoreDrugKey key;

  public StoreDrugKey getKey() {
    return key;
  }

  public void setKey(StoreDrugKey key) {
    this.key = key;
  }
}
