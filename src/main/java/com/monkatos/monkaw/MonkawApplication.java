package com.monkatos.monkaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.monkatos.monkaw.model.MockModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class MonkawApplication {


	public static void main(String[] args) {
		SpringApplication.run(MonkawApplication.class, args);


		// List<MockModel> mList = new ArrayList<MockModel>();
		// MockModel m = new MockModel();
		// m.ppk = "slaut";
		// MockModel mee = new MockModel();
		// mee.ppk = "slaut";
		// mList.add(m);
		// mList.add(mee);

		// Mono<List<MockModel>> me = Mono.just(mList).map( mock -> mock).log();
		// Flux<List<MockModel>> x = Flux.just(mList).map( mock -> mock).log();


		// me.subscribe();
		// x.subscribe();
		

	}

}
