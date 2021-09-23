package com.andre.tdd.repository;

import java.util.Optional;

import com.andre.tdd.model.DeliveryModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryModel, String>{
    Optional<DeliveryModel> findByCompradorName(String name);

}
