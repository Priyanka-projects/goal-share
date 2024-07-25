package com.shared_goal_service.shared_goal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class ExistingCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "custID")
    private UUID cust_id;

    private String custname;
    private String username;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;
}
