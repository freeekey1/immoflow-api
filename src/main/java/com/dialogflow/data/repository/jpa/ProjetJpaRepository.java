package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.ProjetEntity;

/**
 * Repository : Projet.
 */
public interface ProjetJpaRepository extends PagingAndSortingRepository<ProjetEntity, Integer> {

}
