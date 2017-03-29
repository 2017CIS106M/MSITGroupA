package com.salesorderapp.backend.daos;

import com.salesorderapp.backend.models.Customer;
import com.salesorderapp.backend.models.Drug;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DrugDao extends BaseDao<Drug> {

  private static final String ENTITY = "Drug";
  public List<Drug> getAll(){
    return super.getAll(ENTITY);
  }

  public Drug getDrugByCode(final String code){
    return super.getDrugByCode(ENTITY, code);
  }
}
