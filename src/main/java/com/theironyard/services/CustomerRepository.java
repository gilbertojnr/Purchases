package com.theironyard.services;

import com.theironyard.entities.Customer;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by gilbertakpan on 1/14/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
