package com.stackroute.repository;

import com.stackroute.domain.Muzix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Extends mongo repository
@Repository
public interface MuzixRepository extends MongoRepository<Muzix,Integer> {
}
