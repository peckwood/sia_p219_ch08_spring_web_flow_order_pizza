package pizza.service;

import pizza.flow.domain.Customer;

public interface CustomerService {
   Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}