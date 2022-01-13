package com.kyc.repo;

import com.kyc.model.Anagrafica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnagraficaRepo extends CrudRepository<Anagrafica, String> {

}
