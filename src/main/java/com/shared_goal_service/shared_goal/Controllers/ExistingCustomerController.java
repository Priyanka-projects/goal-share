package com.shared_goal_service.shared_goal.Controllers;

import com.shared_goal_service.shared_goal.Dto.UserDto;
import com.shared_goal_service.shared_goal.Entity.*;
import com.shared_goal_service.shared_goal.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ExistingCustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping(value = "/customer/add/customer")
    public ResponseEntity saveUserData(@RequestBody ExistingCustomer customer){
        try {
            String password = bCryptPasswordEncoder.encode(customer.getPassword());
            customer.setPassword(password);

            Account acc= customer.getAccount();


         return null;

        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(e.fillInStackTrace());
        }
    }

}
