package com.shared_goal_service.shared_goal.Services;

import com.shared_goal_service.shared_goal.Entity.ExistingCustomer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Override
    public ExistingCustomer saveCustomerData(ExistingCustomer customer) {
        return null;
    }

    @Override
    public ExistingCustomer findCustomerById(UUID id) {
        return null;
    }
}
