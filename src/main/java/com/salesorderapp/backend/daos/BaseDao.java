package com.salesorderapp.backend.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shittu on 01/06/2016.
 */
@Repository
@Transactional
public abstract class BaseDao<T> {
  /**
   * Save the Object in the database.
   */
  public void create(final T object) {

    entityManager.persist(object);
    return;
  }

  /**
   * Delete the Object from the database.
   */
  public void delete(final T object) {
    if (entityManager.contains(object))
      entityManager.remove(object);
    else
      entityManager.remove(entityManager.merge(object));
    return;
  }

  /**
   * Return all the Objects stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List<T> getAll(final String entity) {

    return entityManager.createQuery(String.format("from %s", entity)).getResultList();
  }

  public void truncate(final String entity) {
    entityManager.createQuery(String.format("delete from %s", entity)).executeUpdate();
  }

  /**
   * Return the Object having the passed id.
   */
  public T getById(final Class classType, final long code) {
    return (T)entityManager.find(classType, code);
  }

  public T getById(final Class classType, final String code) {
    return (T)entityManager.find(classType, code);
  }

  /**
   * Update the passed Object in the database.
   */
  public void update(final T object) {
    entityManager.merge(object);
    return;
  }

  /**
   * Return the Object having the passed email.
   */
  public List<T> getBySalesCode(final String entity, final long salesCode) {
    return entityManager.createQuery(String.format("from %s where sales_code = %s", entity, salesCode))
        .getResultList();
  }

  public List<T> getBySymptomsCode(final String entity, final String symptomsCode) {
    return entityManager.createQuery(String.format("from %s where symptoms_cd = '%s'", entity, symptomsCode))
            .getResultList();
  }
  public List<T> getByDiseaseCode(final String entity, final String diseaseCode) {
    return entityManager.createQuery(String.format("from %s where disease_cd = '%s'", entity, diseaseCode))
            .getResultList();
  }
  public T getDrugByCode(final String entity, final String diseaseCode) {
    return (T)entityManager.createQuery(String.format("from %s where drug_cd = '%s'", entity, diseaseCode))
            .getSingleResult();
  }

  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;
}
