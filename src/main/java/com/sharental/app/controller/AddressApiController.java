package com.sharental.app.controller;

import com.sharental.app.repository.AddressRepository;
import com.sharental.app.repository.UserRepository;
import com.sharental.app.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class AddressApiController {
    private final AddressService addressService;
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;


}
