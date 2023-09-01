package com.example.demo.controller;

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

import com.example.demo.entity.Model;
import com.example.demo.service.Carservice;

@RestController
@RequestMapping("/api/cars")
public class Controller {
	
	@Autowired
	Carservice carser;
	@GetMapping("/{id}")
	public Optional<Model> getcarbyid(@PathVariable int id)
	{
		return carser.getcarbyid( id);
	}
	@GetMapping
	public List<Model> getcarbyid()
	{
		return carser.getallcars();
	}
	@PostMapping
	public Model addcar(@RequestBody Model model)
	{
		return carser.addcar(model);
	}
	@PutMapping("/update")
	public Model updatecar(@RequestBody Model model)
	{
		return carser.updatecar(model);
	}
	@DeleteMapping("/{id}")
	public void deletecar(@PathVariable int id)
	{
		 carser.deletecar(id);
	}
	@GetMapping("/owners/{owners}")
	public List<Model> findcarsbyowners(@PathVariable int owners)
	{
		return carser.findcarsbyowners(owners);
	}
	@GetMapping("/owners/{owners}/cartype/{cartype}")
	public List<Model> findcarsbyownersandcartype(@PathVariable int owners,@PathVariable String cartype)
	{
		return carser.findcarsbyownersandcartype(owners,cartype);
	}
	@GetMapping("/carname/{carname}")
	public List<Model> findcarsbycarname(@PathVariable String carname)
	{
		return carser.findcarsbycarname(carname);
	}
	@GetMapping("/address/{address}")
	public List<Model> findcarsbyaddress(@PathVariable String address)
	{
		return carser.findcarsbyaddress(address);
	}

}
