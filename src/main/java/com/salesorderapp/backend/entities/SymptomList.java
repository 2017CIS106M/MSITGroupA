package com.salesorderapp.backend.entities;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.salesorderapp.backend.models.Drug;
import com.salesorderapp.backend.models.Symptoms;

import java.util.List;

public class SymptomList {
  private List<Symptoms> symptoms;

  public SymptomList() {
  }

  public SymptomList(final List<Symptoms> symptoms) {
    this.symptoms = symptoms ;
  }

  public List<Symptoms> getSymptoms() {
    return symptoms ;
  }

  public void setDrug(final List<Symptoms> symptoms ) {
    this.symptoms = symptoms ;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final SymptomList that = (SymptomList) o;
    return Objects.equal(symptoms, that.symptoms);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(symptoms);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("symptoms", symptoms)
        .toString();
  }
}
