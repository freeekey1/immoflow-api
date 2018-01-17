package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.UtilisateurEntity;

/**
 * Repository : Utilisateur.
 */
public interface UtilisateurJpaRepository extends PagingAndSortingRepository<UtilisateurEntity, Integer> {

}
