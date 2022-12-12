package com.bah.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.bah.spring.domain.Customer;

public interface CustomersRepository extends MongoRepository<Customer, String> {

}
