package com.dialogflow.data.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.dialogflow.bean.jpa.DossierEntity;

/**
 * Repository : Dossier.
 */
public interface DossierJpaRepository extends PagingAndSortingRepository<DossierEntity, Integer> {

	@Async
    @Query(value = "select t.val, t.descript, t.REF_PROJET,t.SUM_RECETTE from ( "
    	 +"SELECT   count(s.ID) as val, 'VJ' as descript, s.REF_PROJET, sum(s.sum_recette) as sum_recette  from " 
    	 +"(SELECT DOSSIER.ID,min(RECETTE.DATE_DEPOT) as date_vente,DOSSIER.REF_PROJET, sum(RECETTE.montant) as sum_recette,"
    	 +"ECHEANCE.MONTANT "
    	 +"FROM   RECETTE, DOSSIER, ECHEANCE , UTILISATEUR_TRANCHE U "
    	 +"WHERE (DOSSIER.ID = RECETTE.REF_DOSSIER) "
    	 +"AND  (DOSSIER.ID = ECHEANCE.REF_DOSSIER) "
    	 +"AND ECHEANCE.NUMERO=1 "
    	 +"AND DOSSIER.ETAT = 'actif' "
    	 +"and DOSSIER.REF_PROJET =:projet "
    	 +"AND RECETTE.ETAT is null "
    	 +"AND DOSSIER.REF_TRANCHE = U.REF_TRANCHE "
    	 +"group by DOSSIER.ID,DOSSIER.REF_PROJET,ECHEANCE.MONTANT) s  "  	     
    	 +"where s.sum_recette>=s.montant "
    	 +"group by s.REF_PROJET  ) t", nativeQuery = true) 
	Object[] ventesParProjet(@Param("projet") Long projet);
}
