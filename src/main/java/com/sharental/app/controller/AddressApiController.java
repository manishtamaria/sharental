package com.sharental.app.controller;

import com.sharental.app.pojo.Address;
import com.sharental.app.pojo.User;
import com.sharental.app.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

public class AddressApiController {
    private final AddressService addressService;
    @PostMapping("/api/address/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAddress(@RequestBody Address address, User userId){
        addressService.addAddress(address, userId);
    }

}
