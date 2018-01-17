package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.DossierEntity;

/**
 * Repository : Dossier.
 */
public interface DossierJpaRepository extends PagingAndSortingRepository<DossierEntity, Integer> {

}
