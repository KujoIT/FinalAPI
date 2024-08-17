package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping(path = "/address")
public class AddressController {
	@Autowired
	public AddressService addressService;
	
	@GetMapping(path = "/get")
	public List<Address> getAddresses(){
		return this.addressService.getAddresses();
	}
	
	@PostMapping(path = "/post")
	public Address addAddress(@RequestBody Address address) {
		return this.addressService.addAddress(address);
	}
	
	@DeleteMapping(path = "/delete={id}")
	public Address deleteAddress(@PathVariable int id) {
		return this.addressService.deleteAddress(id);
	}
}
