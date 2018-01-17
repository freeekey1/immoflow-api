package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.EcheanceEntity;

/**
 * Repository : Echeance.
 */
public interface EcheanceJpaRepository extends PagingAndSortingRepository<EcheanceEntity, Integer> {

}
