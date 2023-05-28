package com.assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Exception.DataException;
import com.assignment.Model.Data;
import com.assignment.Service.DataService;

@RestController
public class DataModelController {
	@Autowired
	private DataService dserv;
	@GetMapping("/Data")
	public ResponseEntity<List<Data>> findData() throws DataException{
		List<Data> list=dserv.findData();
		return new ResponseEntity<List<Data>>(list, HttpStatus.OK);

	}

	@GetMapping("/Intensity")
	public ResponseEntity<List<Integer>> findIntensity() throws DataException{
		List<Integer> list=dserv.findIntensity();
		return new ResponseEntity<List<Integer>>(list, HttpStatus.OK);

	}
	@GetMapping("/Likelihoods")
	public ResponseEntity<List<Integer>> findLikelihood() throws DataException{
		List<Integer> list=dserv.findLikelihood();
		return new ResponseEntity<List<Integer>>(list, HttpStatus.OK);

	}
	@GetMapping("/Relevance")
	public ResponseEntity<List<Integer>> findRelevance() throws DataException{
		List<Integer> list=dserv.findRelevance();
		return new ResponseEntity<List<Integer>>(list, HttpStatus.OK);

	}
	@GetMapping("/Year")
	public ResponseEntity<List<String>> findYeary() throws DataException{
		List<String> year=dserv.findYear();
		return new ResponseEntity<List<String>>(year, HttpStatus.OK);

	}
	@GetMapping("/Country")
	public ResponseEntity<List<String>> findCountry() throws DataException{
		List<String> year=dserv.findCountry();
		return new ResponseEntity<List<String>>(year, HttpStatus.OK);

	}
	@GetMapping("/Topic")
	public ResponseEntity<List<String>> findTopic() throws DataException{
		List<String> topic=dserv.findTopic();
		return new ResponseEntity<List<String>>(topic, HttpStatus.OK);

	}
	@GetMapping("/Region")
	public ResponseEntity<List<String>> findRegion() throws DataException{
		List<String> region=dserv.findregion();
		return new ResponseEntity<List<String>>(region, HttpStatus.OK);

	}
	@GetMapping("/City")
	public ResponseEntity<List<String>> findCity() throws DataException{
		List<String> city=dserv.findCity();
		return new ResponseEntity<List<String>>(city, HttpStatus.OK);

	}
	
	
}
