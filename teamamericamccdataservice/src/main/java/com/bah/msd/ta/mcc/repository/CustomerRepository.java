package com.bah.msd.ta.mcc.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.ta.mcc.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
