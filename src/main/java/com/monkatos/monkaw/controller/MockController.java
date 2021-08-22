// package com.monkatos.monkaw.controller;

// import java.util.List;

// import com.monkatos.monkaw.model.MockModel;
// import com.monkatos.monkaw.repository.MockRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

// // https://github.com/armdev/reactive-dev/blob/master/sp33/src/main/java/io/project/app/ReactiveController.java

// @Controller
// @RequestMapping(path = "/mocks")  
// public class MockController {

//     @Autowired
//     MockRepository mockRepository;

//     @GetMapping()  
//     public @ResponseBody  
//     Flux<?> ab() {  
//         Flux<?> m = this.mockRepository.findAll();
        
//         return m;
//     }

//     @GetMapping("xd")
//     public Flux<MockModel> xd () {
//         return this.mockRepository.findAll();
//     }   
//     // @GetMapping("eee")
//     // public ResponseEntity<Flux<?>> getMocks() {
//     //     return new ResponseEntity<>(this.mockRepository.findAll(), HttpStatus.OK);
//     // }

// 	// @GetMapping(value="/books", produces = { MediaType.APPLICATION_JSON_VALUE })
// 	// public Mono<ResponseEntity<List<MockModel>>> getAllBooks() {
// 	// 	return mockRepository.findAll().
// 	// 			.map(list -> new ResponseEntity<List<MockModel>>(HttpStatus.OK));
// 	// }	
//     // @GetMapping("test")  
//     // public @ResponseBody  
//     // Mono<MockModel> test() {  
//     //     MockModel m = new MockModel();
//     //     m.ppk= "salla";
//     //     return mockRepository.save(m);  
//     // }
    
// }
