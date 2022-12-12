package com.bah.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.bah.spring.domain.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, String> {

}
