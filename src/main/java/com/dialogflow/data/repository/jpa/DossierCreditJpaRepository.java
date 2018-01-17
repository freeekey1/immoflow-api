package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.DossierCreditEntity;

/**
 * Repository : DossierCredit.
 */
public interface DossierCreditJpaRepository extends PagingAndSortingRepository<DossierCreditEntity, Integer> {

}
