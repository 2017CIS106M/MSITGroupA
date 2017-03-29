package com.salesorderapp.backend.daos;

import com.salesorderapp.backend.models.DiseaseSymptoms;
import com.salesorderapp.backend.models.DrugDisease;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DrugDiseaseDao extends BaseDao<DrugDisease> {

  private static final String ENTITY = "DrugDisease";
  public List<DrugDisease> getAll(){
    return super.getAll(ENTITY);
  }

  public List<DrugDisease> getByDiseaseCode(final String code){
    return super.getByDiseaseCode(ENTITY, code);
  }


}
