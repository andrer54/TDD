package com.andre.tdd.service;
import java.time.Period;
import java.util.Optional;

import com.andre.tdd.model.DeliveryModel;
import com.andre.tdd.repository.DeliveryRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public int daysCalculatorWithDataBase(String name) {
        Optional<DeliveryModel> deliveryModelOptional = deliveryRepository.findByCompradorName(name);
        return Period.between(deliveryModelOptional.get().getDataCompra(), deliveryModelOptional.get().getDataEntrega()).getDays();
    }
}
