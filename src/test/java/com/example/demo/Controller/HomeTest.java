package com.example.demo.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.hamcrest.Matchers.containsString;
import lombok.SneakyThrows;

@WebMvcTest(Home.class)
public class HomeTest {

    @Autowired
    private Home home;

    @Autowired
    private MockMvc mockMvc;

    @Test @SneakyThrows
    void homeTest(){
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("this is home\n\nVersion: ")));
    }
}