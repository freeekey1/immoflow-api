package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.ReferenceEntity;

/**
 * Repository : Reference.
 */
public interface ReferenceJpaRepository extends PagingAndSortingRepository<ReferenceEntity, Integer> {

}
