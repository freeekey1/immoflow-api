package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.TrancheEntity;

/**
 * Repository : Tranche.
 */
public interface TrancheJpaRepository extends PagingAndSortingRepository<TrancheEntity, Integer> {

}
