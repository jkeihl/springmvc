package com.example.services;

import com.example.domain.Customer;
import com.example.domain.DomainObject;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by jeff on 4/19/2017.
 */
@Service
@Profile("map")
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {

    private Map<Integer, DomainObject> customers;

    @Override
    public List<DomainObject> listAll() {
        //return new ArrayList<>(customers.values());
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {

        return (Customer) super.getById(id);

    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {

        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {

        super.delete(id);
    }


}