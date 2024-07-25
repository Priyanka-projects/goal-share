package com.shared_goal_service.shared_goal.Dao;

import com.shared_goal_service.shared_goal.Entity.ExistingCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerRepository extends JpaRepository<ExistingCustomer, UUID> {

}
