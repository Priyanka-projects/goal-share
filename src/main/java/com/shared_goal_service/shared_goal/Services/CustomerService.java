package com.shared_goal_service.shared_goal.Services;

import com.shared_goal_service.shared_goal.Entity.ExistingCustomer;

import java.util.UUID;

public interface CustomerService {

    ExistingCustomer saveCustomerData(ExistingCustomer customer);

    ExistingCustomer findCustomerById(UUID id);




}
