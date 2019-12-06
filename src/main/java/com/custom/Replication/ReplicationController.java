package com.custom.Replication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.custom.Replication.*;
import com.custom.Replication.entity.ReplicationDetails;
import com.custom.Replication.entity.ResponseDTO;
import com.custom.Replication.service.ReplicationServiceImpl;

@RestController
public class ReplicationController {

	@Autowired 
	private ReplicationServiceImpl replicationservice; 
	
	@RequestMapping("/replicate")
	public ResponseEntity<ResponseDTO> replicate(){
	
		System.out.println("Hitting the request");
		replicationservice.getkeyvalues();
		
		ResponseEntity<ResponseDTO> response = null; 
		response.status(HttpStatus.CREATED);
	 return response; 
	 
	}
	
	@RequestMapping("/test")
	public String test(){
		return "Hello World"; 
	}
}
