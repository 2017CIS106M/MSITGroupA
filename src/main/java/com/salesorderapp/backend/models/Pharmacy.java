package com.salesorderapp.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

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
@Table(name = "pharmacy")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pharmacy implements Serializable {

  @Id
  private String pharmacy_cd;

  @NotNull
  @Size(min = 2, max = 80)
  @Column(name = "name")
  private String name;

  @Column(name = "logo")
  private Blob logo;

  @Column(name = "lto_no")
  private String lto_no;

  @Column(name = "validity_date")
  private Date validity_date;

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

  public Pharmacy() { }

  public String getPharmacy_cd() {
    return pharmacy_cd;
  }

  public void setPharmacy_cd(String pharmacy_cd) {
    this.pharmacy_cd = pharmacy_cd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Blob getLogo() {
    return logo;
  }

  public void setLogo(Blob logo) {
    this.logo = logo;
  }

  public String getLto_no() {
    return lto_no;
  }

  public void setLto_no(String lto_no) {
    this.lto_no = lto_no;
  }

  public Date getValidity_date() {
    return validity_date;
  }

  public void setValidity_date(Date validity_date) {
    this.validity_date = validity_date;
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
}
