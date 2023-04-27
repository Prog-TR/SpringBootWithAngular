package ca.sheridancollege.ranati.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.ranati.beans.Stationery;
import ca.sheridancollege.ranati.services.StationeryService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/stationeries")
public class StationeryRestController {
	
	private StationeryService sSrv;
	
	@GetMapping(value={"", "/"})
	public List<Stationery> getStationeries() {
		
		return sSrv.getStationerys();
	}
	
	@GetMapping("/{id}")
	public Stationery getStationeryById(@PathVariable Long id) {
		
		return sSrv.getStationeryById(id);
	}
	
	@PostMapping(value={"", "/"})
	public Stationery addStationery(@RequestBody Stationery stationery) {
		
		return sSrv.addStationery(stationery);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStationery(@PathVariable Long id) {
		
		sSrv.deleteStationeryById(id);
		return "Deleted!";
	}
}
