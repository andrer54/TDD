package com.andre.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
public class DeliveryControllerTest {
    

    @Autowired
    MockMvc mockMvc;

    @Test
    public void deliveryTestGetAll() throws Exception{
        mockMvc.perform(get("/delivery"))
                .andExpect(status().isOk());
    }
}
