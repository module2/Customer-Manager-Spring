package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Truong", "truong@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Tien", "tnt@codegym.vn", "Thaibinh"));
        customerMap.put(3, new Customer(3, "Dat", "dat@codegym.vn", "Thaibinh"));
        customerMap.put(4, new Customer(4, "Long", "tieulongnu@codegym.vn", "Laocai"));
        customerMap.put(5, new Customer(5, "Hau", "hauss@codegym.vn", "Hanoi"));
        customerMap.put(6, new Customer(6, "TuanAnh", "sasa@codegym.vn", "Ninhbinh"));
    }

    @Override
    public List<Customer> findAll(){
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer){

        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id){
        return customerMap.get(id);
    }

    @Override
    public  void update(int id, Customer customer){
        customerMap.put(id, customer);

    }

    @Override
    public void remove(int id){
        customerMap.remove(id);
    }
}
