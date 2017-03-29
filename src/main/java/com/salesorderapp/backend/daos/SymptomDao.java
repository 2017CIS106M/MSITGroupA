package com.salesorderapp.backend.daos;

import com.salesorderapp.backend.models.Drug;
import com.salesorderapp.backend.models.Symptoms;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SymptomDao extends BaseDao<Symptoms> {

  private static final String ENTITY = "Symptoms";
  public List<Symptoms> getAll(){
    return super.getAll(ENTITY);
  }

  public Symptoms getById(final String code){
    return super.getById(Drug.class, code);
  }
}
