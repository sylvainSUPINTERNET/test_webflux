package com.monkatos.monkaw.middleware;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.monkatos.monkaw.model.MockModel;
import com.monkatos.monkaw.repository.MockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MockHandler {
    @Autowired
    MockRepository mockRepository;

    public Mono<ServerResponse> get (ServerRequest req) {

        MultiValueMap<String, String> queryParams = req.queryParams();
    
        // 1 
        // 1 * 10 10
        // 10 - 1 * 10 = 0

        // 2 
        // 2 * 10 20
        // 20 - 10 = 10
        
        // 3 
        // 3 * 10 30
        // 30 - 10 = 20 

        Integer limit = 0;
        Integer offset = 0;
        Set<String> methodNamesSet = queryParams.keySet();
        for(String str: methodNamesSet) {
                if ( Integer.parseInt(queryParams.get(str).get(0)) == 0 ) {
                    limit = 10;
                } else {
                    limit = Integer.parseInt(queryParams.get(str).get(0)) * 10;
                }
                offset = limit - 10;
        }

        Pageable pageable = PageRequest.of(offset,limit);
        
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON).body(this.mockRepository.findBy(pageable), MockModel.class).switchIfEmpty(ServerResponse.notFound().build()); //.bodyValue(this.mockRepository.findAll().map( e -> e.id))
    }
}
