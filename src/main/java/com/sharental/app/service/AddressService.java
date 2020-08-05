package com.sharental.app.service;

import com.sharental.app.pojo.Address;
import com.sharental.app.repository.AddressRepository;
import com.sharental.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class AddressService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public void addAddress(Address address, Integer userId){
        address.setUser(userRepository.getOne(userId));
        addressRepository.save(address);


    }
}
