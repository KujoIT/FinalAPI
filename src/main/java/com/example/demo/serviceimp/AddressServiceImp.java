package com.example.demo.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;

@Service
public class AddressServiceImp implements AddressService{
	@Autowired
	public AddressRepository addressRepository;
	
	@Override
	public List<Address> getAddresses() {
		return this.addressRepository.findAll();
	}
	
	@Override //add
	public Address addAddress(Address address) {
		return this.addressRepository.save(address);
	}
	
	@Override //delete
	public Address deleteAddress(int id) {
		this.addressRepository.deleteById(id);;
		return null;
	}
}
