package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.RecetteEntity;

/**
 * Repository : Recette.
 */
public interface RecetteJpaRepository extends PagingAndSortingRepository<RecetteEntity, Integer> {

}
