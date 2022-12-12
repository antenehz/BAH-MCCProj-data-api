package com.bah.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.bah.spring.domain.Event;

public interface EventRepository extends MongoRepository<Event, String> {

}
