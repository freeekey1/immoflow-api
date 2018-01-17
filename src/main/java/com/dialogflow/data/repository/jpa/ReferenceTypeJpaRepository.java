package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.ReferenceTypeEntity;

/**
 * Repository : ReferenceType.
 */
public interface ReferenceTypeJpaRepository extends PagingAndSortingRepository<ReferenceTypeEntity, Integer> {

}
