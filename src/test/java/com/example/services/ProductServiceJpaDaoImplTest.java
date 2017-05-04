package com.example.services;

import com.example.config.JpaIntegrationConfig;
import com.example.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by jeff on 5/1/2017.
 */
// Uses the Spring Test runner instead of Junit so Spring can set the context
@RunWith(SpringJUnit4ClassRunner.class)
// Tells Spring which config to use.
@SpringBootTest(classes = JpaIntegrationConfig.class)
@ActiveProfiles({"jpadao"})
public class ProductServiceJpaDaoImplTest {
    private ProductService productService;

    @Autowired
    // Will inject the Service
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void testListMethod() throws Exception{
        // Had to cast due to an issue...?    Was: List<?> listAll() - change to List<T> listAll();;
        List<Product> products =  (List<Product>) productService.listAll();
        assert products.size() == 5;
    }
}
