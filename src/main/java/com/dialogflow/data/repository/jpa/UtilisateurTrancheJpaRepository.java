package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.UtilisateurTrancheEntity;

/**
 * Repository : UtilisateurTranche.
 */
public interface UtilisateurTrancheJpaRepository extends PagingAndSortingRepository<UtilisateurTrancheEntity, Integer> {

}
