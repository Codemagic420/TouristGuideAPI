package com.example.TouristGuideAPI.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.TouristGuideAPI.controller.TouristController;
import com.example.TouristGuideAPI.model.TouristAttraction;
import com.example.TouristGuideAPI.service.TouristService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TouristController.class)
@SuppressWarnings("java:S5976") // Suppress "Sharing is only supported..." warning
public class TouristControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TouristService touristService;

    @InjectMocks
    private TouristController touristController;

    @BeforeEach
    public void setUp() {
        // Mock data
        List<TouristAttraction> attractions = new ArrayList<>();
        attractions.add(new TouristAttraction("Divan", "Description 1", "City 1", List.of("Tag1", "Tag2")));
        attractions.add(new TouristAttraction("Kebabistan", "Description 2", "City 2", List.of("Tag3", "Tag4")));

        // Mocking service method
        when(touristService.getAttraction()).thenReturn(attractions);
    }

    @Test
    public void testShowAttractionListIntegration() throws Exception {
        // Perform GET request and verify response
        mockMvc.perform(get("/attractions"))
                .andExpect(status().isOk())
                .andExpect(view().name("attractionList"))
                .andExpect(model().attributeExists("attractions"))
                .andExpect(model().attribute("attractions", hasSize(2))); // Ensure size is 2
    }


}
