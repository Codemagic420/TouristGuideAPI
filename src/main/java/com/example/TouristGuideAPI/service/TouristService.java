package com.example.TouristGuideAPI.service;

import com.example.TouristGuideAPI.model.TouristAttraction;
import com.example.TouristGuideAPI.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAttraction() {
        return touristRepository.getTouristAttractions();
    }

    public TouristAttraction getAttractionByName(String name) {
        return touristRepository.getAttractionByName(name);
    }

    public void addAttraction(TouristAttraction touristAttraction) {
        touristRepository.addTouristAttraction(touristAttraction);
    }

    public void updateAttraction(TouristAttraction touristAttraction) {
        touristRepository.updateTouristAttraction(touristAttraction);
    }

    public void deleteAttraction(String name) {
        touristRepository.deleteAttraction(name);
    }
    public List<String> getTagsForAttraction(String name){
        return touristRepository.getTagsForAttraction(name);
    }
    public List<String> getTags(){
        return touristRepository.getTags();

    }
    public List<String> getCities(){
        return touristRepository.getCities();
    }
}
