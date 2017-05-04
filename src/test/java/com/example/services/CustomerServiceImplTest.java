package com.example.services;

import com.example.config.JpaIntegrationConfig;
import com.example.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by jeff on 5/3/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaIntegrationConfig.class)
@ActiveProfiles({"map"})
public class CustomerServiceImplTest {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }

    @Test
    public void testListMethod() throws Exception {
        // Casting had to be added because the CRUDService used ? instead of T
        List<Customer> customers = (List<Customer>) customerService.listAll();
        //List<Customer> customers = customerService.listAll();
        assert customers.size() == 2;
    }
}