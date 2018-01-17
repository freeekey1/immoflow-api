package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.DossierClientEntity;

/**
 * Repository : DossierClient.
 */
public interface DossierClientJpaRepository extends PagingAndSortingRepository<DossierClientEntity, Integer> {

}
