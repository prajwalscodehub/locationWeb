package com.location.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Locations;
import com.location.exeption.LocationNotFound;
import com.location.repository.LocationRepositry;

@RestController
public class LocationRestController2 {
	@Autowired
	LocationRepositry locationrepo;

	@RequestMapping("/locations/find/{id}")
	public Locations getlocations(@PathVariable("id") long id) {
		if(id==0) {throw new LocationNotFound();
		}	
	Optional<Locations> findById = locationrepo.findById(id);
	Optional<Locations> empty = Optional.empty();
	if(locationrepo.findById(id)==empty) {
		System.out.println("empty");
		throw new LocationNotFound();
	}
	else {
		System.out.println("not null");
		Locations locations = findById.get();
		return locations;
	}}}
		
//Optional<Locations> findById = locationrepo.findById(id);
//if(findById.isPresent()){
//	System.out.println("present");
//	System.out.println("not null");
//	Locations locations = findById.get();
//	return locations;
//}
	//else {
//	throw new LocationNotFound();
//}}}