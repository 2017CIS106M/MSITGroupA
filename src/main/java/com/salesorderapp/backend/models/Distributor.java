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
@Table(name = "distributor")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distributor implements Serializable {

  @Id
  private String distributor_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  public Distributor() { }

  public String getDistributor_cd() {
    return distributor_cd;
  }

  public void setDistributor_cd(String distributor_cd) {
    this.distributor_cd = distributor_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
