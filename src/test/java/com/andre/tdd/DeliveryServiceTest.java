package com.andre.tdd;

import com.andre.tdd.service.DeliveryService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

//import org.junit.runner.RunWith;

@SpringBootTest
public class DeliveryServiceTest {
    
    @TestConfiguration
    static class DeliveryServiceTestConfiguration{
        
        @Bean
        public DeliveryService deliveryService(){
            return new DeliveryService();
        }
    }

    @Autowired
    DeliveryService deliveryService;

    @Test
    public void deliveryTestServiceDaysCalculator(){
        String name = "andre";
        int days = deliveryService.daysCalculatorWithDataBase(name);

        Assertions.assertEquals(days, 10);
    }

}