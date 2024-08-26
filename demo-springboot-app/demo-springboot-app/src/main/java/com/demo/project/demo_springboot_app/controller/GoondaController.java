package com.demo.project.demo_springboot_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.demo_springboot_app.model.Worker;
import com.demo.project.demo_springboot_app.repository.WorkerRepository;

@RestController
public class GoondaController {
@Autowired
   private WorkerRepository workerRepository;
    
   @PostMapping("/saveWorker")
   public Worker saveWorker(@RequestBody Worker worker) {
	   return workerRepository.save(worker);
   }
   
   @GetMapping("/saveWorker")
   public Iterable<Worker> getWorker() {
	   return workerRepository.findAll();
   }

   
   
   @GetMapping("/saveWorker/{id}")
   public Worker getWorker(@PathVariable int id) {
   Optional<Worker> opt=workerRepository.findById(id);
	   if(opt.isEmpty()) 
		   
			   return null;
			   return opt.get();
}
}
  

 