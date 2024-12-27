package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syam.train.Passenger;
import com.syam.train.Train;

@RestController
public class MyController {
	
	@PostMapping(
			value = "/train",
			produces = {"application/json"},
			consumes = {"application/json"}
			)
	public ResponseEntity<Train> booking(@RequestBody Passenger p ){
		Train train = new Train();
		train.setNo(1234);
		train.setTrainName("Godawari");
		train.setToAdd("vsp");
		train.setFromAdd("hyd");
		train.setCost(500);
		
		return new ResponseEntity<Train >(train,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/train")
	public ResponseEntity<String> updating(@RequestBody Passenger passengerInfo){
		System.out.println(passengerInfo);
		
		return new ResponseEntity<>("updated........",HttpStatus.OK);
	}
	
	
	/*	@DeleteMapping("/train")	//localhost:8080/train?name=syam&no=1
		public ResponseEntity<String> deleting(@RequestParam("name") String name,@RequestParam("no") Integer no){
			System.out.println(name+"   "+no);
			return new ResponseEntity<String>("deleted",HttpStatus.OK);
		}
	*/
	
	@DeleteMapping("/train/{name}")	
	public ResponseEntity<String> deleting(@PathVariable("name") String name){
		return new ResponseEntity<String>("deleted..................",HttpStatus.OK);
	}
}
