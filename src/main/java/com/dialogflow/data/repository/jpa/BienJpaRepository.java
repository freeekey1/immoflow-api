package com.dialogflow.data.repository.jpa;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.dialogflow.bean.jpa.BienEntity;

/**
 * Repository : Bien.
 */
public interface BienJpaRepository extends PagingAndSortingRepository<BienEntity, Integer> {
	
	@Async
    @Query(value = "SELECT count(b.id) from bien b,tranche t, projet p "+
    		"where b.ref_tranche=t.id and p.ID=t.ref_projet and b.etat='libre' and p.id =:projet", nativeQuery = true) 
    Object CountLibreByProjet(@Param("projet") Long projet);
}
