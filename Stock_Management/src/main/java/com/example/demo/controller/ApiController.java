package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.StockModal;
import com.example.demo.service.StockService;


@RestController
public class ApiController {
	
	@Autowired
	StockService ss;
	
//	@Autowired
//	UserService us;
	
	@GetMapping("showStock")
	public List<StockModal> showStocks(){
		return ss.showStocks();
	}
	
	@PostMapping("addStocks")
	public String addStocks(@RequestBody List<StockModal> sm) {
		ss.addStocks(sm);
		return "All datas are added to database successfully";
	}
	
	@DeleteMapping("deleteStock")
	public String deleteStocks(@RequestParam int id) {
		ss.deleteStocks(id);
		return "Id "+id+" is deleted" ;
	}
	
	@PutMapping("updateStock")
	public String updateStocks(@RequestBody StockModal sm) {
		ss.updateStocks(sm);
		return "Id "+sm.getId()+" is updated";
	}
	
	@PutMapping("buyStock")
	public String buyStocks(@RequestParam int id, int count) {
		return ss.buyStocks(id, count);
	}
	
//	@GetMapping("showUser")
//	public List<User> showUser(){
//		return us.showUser();
//	}
//	
//	@PostMapping("addUser")
//	public String addUser(@RequestBody List<User> user) {
//		us.addUser(user);
//		return "Users are added successfully";
//	}
//	
//	@DeleteMapping("deleteUser")
//	public String deleteUser(@RequestParam int id) {
//		us.deleteUser(id);
//		return "User "+ id +" deleted successfully";
//	}
//	
//	@PutMapping("updateUser")
//	public String updateUser(@RequestBody User user) {
//		us.updateUser(user);
//		return "User "+user.getName() + " has been updated";
//	}
}
