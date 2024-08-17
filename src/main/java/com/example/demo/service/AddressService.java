package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Address;

public interface AddressService {
	List<Address> getAddresses();
	
	Address addAddress(Address address);
	
	Address deleteAddress(int id);
}
