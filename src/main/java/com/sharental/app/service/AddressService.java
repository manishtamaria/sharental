package com.sharental.app.service;

import com.sharental.app.pojo.Address;
import com.sharental.app.pojo.User;
import com.sharental.app.repository.AddressRepository;
import com.sharental.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class AddressService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public void addAddress(Address address, User user){
        address.setUser(userRepository.getOne(user.getId()));
        addressRepository.save(address);


    }


}
