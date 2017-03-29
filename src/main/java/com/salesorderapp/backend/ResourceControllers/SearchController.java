package com.salesorderapp.backend.ResourceControllers;

import com.salesorderapp.backend.daos.DiseaseSymptomsDao;
import com.salesorderapp.backend.daos.DrugDao;
import com.salesorderapp.backend.daos.DrugDiseaseDao;
import com.salesorderapp.backend.daos.SymptomDao;
import com.salesorderapp.backend.entities.DrugList;
import com.salesorderapp.backend.entities.SymptomList;
import com.salesorderapp.backend.models.DiseaseSymptoms;
import com.salesorderapp.backend.models.Drug;
import com.salesorderapp.backend.models.DrugDisease;
import com.salesorderapp.backend.models.Symptoms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/search")
public class SearchController {

  @RequestMapping(value="/all/drug/" , method = RequestMethod.GET)
  @ResponseBody
  public DrugList getAllDrugs() {
    System.out.println("Got here...");
    try {
      return new DrugList(mDrugDao.getAll());
    }
    catch(final Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  @RequestMapping(value="/drug/", method = RequestMethod.GET)
  @ResponseBody
  public Drug getDrug(@RequestParam(name="code") final String code) {
    try {
      return mDrugDao.getDrugByCode(code);
    }
    catch(Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  @RequestMapping(value="/symptoms/", method = RequestMethod.GET)
  @ResponseBody
  public DrugList getDrugsBySymptoms(@RequestParam(name="symptoms") final String symptoms) {
    System.out.println(symptoms + " is in");
    List<Drug> list = new ArrayList<Drug>();
    try {
      for (Symptoms item : mSymptomsDao.getAll()) {
        if(item.getName().contains(symptoms)) {
          List<DiseaseSymptoms> diseases = mDiseaseSymptomsDao.getBySymptomsCode(item.getSymptoms_cd());
          for(DiseaseSymptoms disease : diseases) {
            List<DrugDisease> drugs = mDrugDiseaseDao.getByDiseaseCode(disease.getKey().getDisease_cd());
            for(DrugDisease drug : drugs) {
              if(null == drug.getKey().getDrug_drug_cd()) {
                System.out.println(drug.getKey().getDisease_disease_cd() + " null");
              }
              list.add(mDrugDao.getDrugByCode(drug.getKey().getDrug_drug_cd()));
            }
          }
        }
      }
      return new DrugList(list);
    }
    catch(Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  // Private fields
  @Autowired
  private DrugDao mDrugDao;

  @Autowired
  private SymptomDao mSymptomsDao;

  @Autowired
  private DiseaseSymptomsDao mDiseaseSymptomsDao;

  @Autowired
  private DrugDiseaseDao mDrugDiseaseDao;
}
