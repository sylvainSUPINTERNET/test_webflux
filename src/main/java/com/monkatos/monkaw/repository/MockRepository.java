package com.monkatos.monkaw.repository;

import com.monkatos.monkaw.model.MockModel;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository
public interface MockRepository extends ReactiveCrudRepository<MockModel, Long> {

    public Flux<MockModel> findBy(Pageable pageable); // findAll not working
    
}

