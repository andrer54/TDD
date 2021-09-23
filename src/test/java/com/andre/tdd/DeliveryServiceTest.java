package com.andre.tdd;

import java.time.LocalDate;
import java.util.Optional;
import com.andre.tdd.model.DeliveryModel;
import com.andre.tdd.repository.DeliveryRepository;
import com.andre.tdd.service.DeliveryService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
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
    @MockBean
    DeliveryRepository deliveryRepository;

    @Test
    public void deliveryTestServiceDaysCalculator(){
        String name = "andre";
        int days = deliveryService.daysCalculatorWithDataBase(name);

        Assertions.assertEquals(days, 10);
    }

    @BeforeEach
    public void setup(){
        LocalDate dataCompra = LocalDate.parse("2021-10-10");
        LocalDate dataEntrega = LocalDate.parse("2021-10-20");

        DeliveryModel deliveryModel = new DeliveryModel("1", "andre", dataCompra, dataEntrega,2);
     
        Mockito.when(deliveryRepository.findByCompradorName(deliveryModel.getCompradorName()))
                    .thenReturn(Optional.of(deliveryModel));
    }

}