package com.salesorderapp.backend.daos;

import com.salesorderapp.backend.models.DiseaseSymptoms;
import com.salesorderapp.backend.models.Drug;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DiseaseSymptomsDao extends BaseDao<DiseaseSymptoms> {

  private static final String ENTITY = "DiseaseSymptoms";
  public List<DiseaseSymptoms> getAll(){
    return super.getAll(ENTITY);
  }

  public List<DiseaseSymptoms> getBySymptomsCode(final String code){
    return super.getBySymptomsCode(ENTITY, code);
  }


}
