package com.andre.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import com.andre.tdd.model.DeliveryModel;
import com.fasterxml.jackson.databind.ObjectMapper;



@SpringBootTest
@AutoConfigureMockMvc
public class DeliveryControllerTest {
    

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void deliveryTestGetAll() throws Exception{
        mockMvc.perform(get("/delivery"))
                .andExpect(status().isOk());
    }

    @Test
    public void deliveryTestSave() throws Exception{
        LocalDate dataCompra = LocalDate.parse("2021-07-07");
        LocalDate dataEntrega = LocalDate.parse("2021-08-08");

        DeliveryModel deliveryModel = new DeliveryModel("2", "andre", dataCompra, dataEntrega, 3);
     
        mockMvc.perform(post("/delivery")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(deliveryModel)))
                .andExpect(status().isOk());
        
    }
}
