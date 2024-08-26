package com.demo.project.demo_springboot_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.project.demo_springboot_app.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Integer>{
	
	   
      
}
