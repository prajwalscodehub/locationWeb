package com.location.services;

import java.util.List;
import java.util.Optional;

import com.location.entities.Locations;

public interface Locationservices {
	
	public void savedata(Locations location);

	public List<Locations> getlocation();

	public void delete(long id);

	public Locations update(long id);

}
