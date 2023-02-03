package com.knowbie.chatgpt.data;

import org.springframework.data.repository.CrudRepository;
import com.knowbie.chatgpt.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}