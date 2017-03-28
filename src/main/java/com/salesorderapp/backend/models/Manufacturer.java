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
@Table(name = "manufacturer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Manufacturer implements Serializable {

  @Id
  private String manufacturer_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  public Manufacturer() { }

  public String getManufacturer_cd() {
    return manufacturer_cd;
  }

  public void setManufacturer_cd(String manufacturer_cd) {
    this.manufacturer_cd = manufacturer_cd;
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
