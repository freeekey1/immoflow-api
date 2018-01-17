package com.dialogflow.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.dialogflow.bean.jpa.ClientEntity;

/**
 * Repository : Client.
 */
public interface ClientJpaRepository extends PagingAndSortingRepository<ClientEntity, Integer> {

}
