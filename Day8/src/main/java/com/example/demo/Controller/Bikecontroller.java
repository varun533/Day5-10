package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Bike;
import com.example.demo.Service.Bikeservice;

@RestController
@RequestMapping("/api/bikes")
public class Bikecontroller {

	@Autowired
	Bikeservice carser;
	@GetMapping("/{id}")
	public Optional<Bike> getcarbyid(@PathVariable int id)
	{
		return carser.getcarbyid( id);
	}
	@GetMapping
	public List<Bike> getcarbyid()
	{
		return carser.getallcars();
	}
	@PostMapping
	public Bike addcar(@RequestBody Bike model)
	{
		return carser.addcar(model);
	}
	@PutMapping("/update")
	public Bike updatecar(@RequestBody Bike model)
	{
		return carser.updatecar(model);
	}
	@DeleteMapping("/{id}")
	public void deletecar(@PathVariable int id)
	{
		 carser.deletecar(id);
	}
	@GetMapping("/year/{year}")
	public List<Bike> findbyyear(@PathVariable int year)
	{
		return carser.findcarsbyowners(year);
	}
	@GetMapping("year/{year}/bikename/{carname}")
	public List<Bike> findbyyearandname(@PathVariable int year,@PathVariable String carname)
	{
		return carser.findcarsbycarname(year, carname);
	}
	
}
