package com.example.bootstrap;

import com.example.domain.Customer;
import com.example.domain.Product;
import com.example.services.CustomerService;
import com.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by jeff on 4/30/2017.
 */
@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private ProductService productService;
    private CustomerService customerService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

        @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadProducts();
        loadCustomers();
    }


    public void loadProducts() {
        Product product1 = new Product();
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");
        productService.saveOrUpdate(product1);

        Product product2 = new Product();
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");
        productService.saveOrUpdate(product2);

        Product product3 = new Product();
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");
        productService.saveOrUpdate(product3);

        Product product4 = new Product();
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");
        productService.saveOrUpdate(product4);

        Product product5 = new Product();
        product5.setDescription("Product 5");
        product5.setPrice(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");
        productService.saveOrUpdate(product5);

    }

    public void loadCustomers() {

        Customer customer1 = new Customer();
        customer1.setFirstName("Alpha");
        customer1.setLastName("Angry");
        customer1.setAddressLine1("100 Acacia St");
        customer1.setAddressLine2("Ste 100");
        customer1.setEmail("acme@acme.com");
        customer1.setPhoneNumber("999-222-3333");
        customer1.setCity("Prescott");
        customer1.setState("AZ");
        customer1.setZipCode("99999");
        customerService.saveOrUpdate(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Beta");
        customer2.setLastName("Betty");
        customer2.setAddressLine1("101 Acacia St");
        customer2.setAddressLine2("Ste 20");
        customer2.setEmail("acme@acme.com");
        customer2.setPhoneNumber("999-222-3333");
        customer2.setCity("Dublin");
        customer2.setState("CA");
        customer2.setZipCode("94568");
        customerService.saveOrUpdate(customer2);

    }

}
