package com.greenfoxacademy.array.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.array.ArrayApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArrayApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void arrayHandleSum() throws Exception {

    mockMvc.perform(
              post("/arrays")
              .contentType(MediaType.APPLICATION_JSON)
              .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void arrayHandleMultiply() throws Exception {

    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"multiply\", \"numbers\": [1, 2, 5, 10]}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(100)));
  }

  @Test
  public void arrayHandleDouble() throws Exception {

    List<Integer> result = new ArrayList(Arrays.asList(2,4,10,20));
    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"double\", \"numbers\": [1, 2, 5, 10]}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is( result)));
  }

  @Test
  public void arrayHandleError() throws Exception {

    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
}