package com.customer.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Customer Accounts")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer Id", nullable = false)
    private Long id;

    @Column(name = "Customer Name")
    private String name;

    @Column(name = "Customer Age")
    private String age;

}
