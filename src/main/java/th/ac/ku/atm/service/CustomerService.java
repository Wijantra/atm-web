package th.ac.ku.atm.service;


import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public void createCustomer(Customer customer) {
        int hashedPin = hash(customer.getPin());
        customer.setPin(hashedPin);
        customers.add(customer);
    }

    private List<Customer> customerList;


    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    private int hash(int value){
        return value;
    }
}

