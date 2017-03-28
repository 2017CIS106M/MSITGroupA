package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "store")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Store implements Serializable {

  @Id
  private String store_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "picture")
  private Blob picture;

  @Column(name = "bldgnoorunitno")
  private String bldgnoorunitno;

  @Column(name = "street")
  private String street;

  @Column(name = "barangay")
  private String barangay;

  @Column(name = "city")
  private String city;

  @Column(name = "province")
  private String province;

  @Column(name = "zipcode")
  private String zipcode;

  @Column(name = "contact_no")
  private String contact_no;

  @Column(name = "contact_person")
  private String contact_person;

  @Column(name = "license_no")
  private String license_no;

  @Column(name = "validity")
  private String validity;

  @Column(name = "pharmacy_cd")
  private String pharmacy_cd;

  public Store() { }

  public String getStore_cd() {
    return store_cd;
  }

  public void setStore_cd(String store_cd) {
    this.store_cd = store_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Blob getPicture() {
    return picture;
  }

  public void setPicture(Blob picture) {
    this.picture = picture;
  }

  public String getBldgnoorunitno() {
    return bldgnoorunitno;
  }

  public void setBldgnoorunitno(String bldgnoorunitno) {
    this.bldgnoorunitno = bldgnoorunitno;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getBarangay() {
    return barangay;
  }

  public void setBarangay(String barangay) {
    this.barangay = barangay;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getContact_no() {
    return contact_no;
  }

  public void setContact_no(String contact_no) {
    this.contact_no = contact_no;
  }

  public String getContact_person() {
    return contact_person;
  }

  public void setContact_person(String contact_person) {
    this.contact_person = contact_person;
  }

  public String getLicense_no() {
    return license_no;
  }

  public void setLicense_no(String license_no) {
    this.license_no = license_no;
  }

  public String getValidity() {
    return validity;
  }

  public void setValidity(String validity) {
    this.validity = validity;
  }

  public String getPharmacy_cd() {
    return pharmacy_cd;
  }

  public void setPharmacy_cd(String pharmacy_cd) {
    this.pharmacy_cd = pharmacy_cd;
  }
}
