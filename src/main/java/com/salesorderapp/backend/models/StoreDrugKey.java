package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreDrugKey implements Serializable {

  @Column(name = "store_cd")
  private String store_cd;

  @Column(name = "drug_cd")
  private String drug_cd;

  public String getStore_cd() {
    return store_cd;
  }

  public void setStore_cd(String store_cd) {
    this.store_cd = store_cd;
  }

  public String getDrug_cd() {
    return drug_cd;
  }

  public void setDrug_cd(String drug_cd) {
    this.drug_cd = drug_cd;
  }
}
