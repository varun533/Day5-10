package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bike;
import com.example.demo.Repository.Bikerepo;

@Service
public class Bikeservice {
	@Autowired
	Bikerepo carrepo;
	
	public Optional<Bike> getcarbyid(int id)
	{
		return carrepo.findById(id);
	}
	public List<Bike> getallcars()
	{
		return carrepo.findAll();
	}
	
	public Bike addcar(Bike model)
	{
		return carrepo.save(model);
	}
	public Bike updatecar(Bike model)
	{
		return carrepo.saveAndFlush(model);
	}
	public void deletecar(int id)
	{
		 carrepo.deleteById(id);
	}

	
	public List<Bike> findcarsbyowners(int owners)
	{
		return carrepo.findbyyear(owners);
	}
	public List<Bike>findcarsbycarname(int year,String carname)
	{
		return carrepo.findbikebyyearandname(year, carname);
	}

}
