package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.ProfilEntity;

/**
 * Repository : Profil.
 */
public interface ProfilJpaRepository extends PagingAndSortingRepository<ProfilEntity, Integer> {

}
