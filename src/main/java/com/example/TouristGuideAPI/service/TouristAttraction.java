package com.example.TouristGuideAPI.service;

//import com.example.TouristGuideAPI.model.TouristAttraction;
import com.example.TouristGuideAPI.repository.TouristAtrractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristAttraction {

    private final TouristAtrractionRepository touristAttractionRepository;

    public TouristAttraction(TouristAtrractionRepository touristAttractionRepository) {
        this.touristAttractionRepository = touristAttractionRepository;
    }



    public List<com.example.TouristGuideAPI.model.TouristAttraction> getAllName() {
        return this.touristAttractionRepository.findAll();
    }
}
