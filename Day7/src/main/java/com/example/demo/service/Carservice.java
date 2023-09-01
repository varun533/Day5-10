package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Model;
import com.example.demo.repository.CarRepo;

@Service
public class Carservice {
	
	@Autowired
	CarRepo carrepo;
	
	public Optional<Model> getcarbyid(int id)
	{
		return carrepo.findById(id);
	}
	public List<Model> getallcars()
	{
		return carrepo.findAll();
	}
	
	public Model addcar(Model model)
	{
		return carrepo.save(model);
	}
	public Model updatecar(Model model)
	{
		return carrepo.saveAndFlush(model);
	}
	public void deletecar(int id)
	{
		 carrepo.deleteById(id);
	}
	
	public List<Model> findcarsbyowners(int owners)
	{
		return carrepo.findcarsbyowners(owners);
	}
	public List<Model>findcarsbycarname(String carname)
	{
		return carrepo.findcarsbycarname(carname);
	}
	public List<Model>findcarsbyaddress(String address)
	{
		return carrepo.findcarsbyaddress(address);
	}
	public List<Model>findcarsbyownersandcartype(int owners,String cartype)
	{
		return carrepo.findcarsbyownersandcartype(owners, cartype);
	}

}
