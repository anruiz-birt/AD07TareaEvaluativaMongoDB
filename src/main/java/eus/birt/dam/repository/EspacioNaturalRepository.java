package eus.birt.dam.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import eus.birt.dam.domain.EspacioNatural;

public interface EspacioNaturalRepository extends MongoRepository<EspacioNatural, String>{
	@Query(value = "{'properties.municipality' : ?0 }")
	List<EspacioNatural> findByMunicipality(String municipality);
}
