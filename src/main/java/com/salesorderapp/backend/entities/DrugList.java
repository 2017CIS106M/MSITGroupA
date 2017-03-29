package com.salesorderapp.backend.entities;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.salesorderapp.backend.models.Drug;

import java.util.List;

public class DrugList {
  private List<Drug> drug;

  public DrugList() {
  }

  public DrugList(final List<Drug> drug) {
    this.drug = drug;
  }

  public List<Drug> getDrug() {
    return drug;
  }

  public void setDrug(final List<Drug> drug) {
    this.drug = drug;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final DrugList that = (DrugList) o;
    return Objects.equal(drug, that.drug);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(drug);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("drug", drug)
        .toString();
  }
}
