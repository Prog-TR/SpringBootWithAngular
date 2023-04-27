package ca.sheridancollege.ranati.services;

import java.util.List;

import ca.sheridancollege.ranati.beans.Stationery;

public interface StationeryService {
	
	public List<Stationery> getStationerys();
	public Stationery getStationeryById(Long id);
	public Stationery addStationery(Stationery stationery);
	public void deleteStationeryById(Long id);

}
