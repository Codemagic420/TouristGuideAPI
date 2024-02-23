package com.example.TouristGuideAPI.repository;

import com.example.TouristGuideAPI.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private List<TouristAttraction> touristAttractions;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();
        touristAttractions.add(new TouristAttraction("Divan", "Divan kebab, is your typical and classic kebab. A basic but tasteful kebab that doesnt hurt your wallet", "Nørrebro", List.of("Cheap", "Basic", "Restaurant")));
        touristAttractions.add(new TouristAttraction("Berlin Döner Kebab", "A different kind of kebab originated in berlin, known for their many sauces and triangler bread, a little more pricey but worth the taste", "Nørrebro", List.of("Pricey", "Restaurant", "Fancy")));
        touristAttractions.add(new TouristAttraction("Kebabistan", "One of the OG spots, well known for their lamb sharwama and very nice turkish bread", "Nørrebro", List.of("Pricey", "Restaurant", "Traditional")));
    }

    public List<TouristAttraction> getTouristAttractions() {
        return touristAttractions;
    }

    public void addTouristAttraction(TouristAttraction touristAttraction) {
        touristAttractions.add(touristAttraction);

    }

    public TouristAttraction getAttractionByName(String name) {
        int i = 0;
        while (i < touristAttractions.size()) {
            if (name.equals(touristAttractions.get(i).getName())) {
                return touristAttractions.get(i);
            }
            i++;
        }
        return null;
    }


    public void updateTouristAttraction(TouristAttraction updatedAttraction) {

        for (TouristAttraction touristAttraction : touristAttractions) {
            if (touristAttraction.getName().equals(updatedAttraction.getName())) {
                touristAttraction.setDescription(updatedAttraction.getDescription());
                touristAttraction.setTags(updatedAttraction.getTags());
                touristAttraction.setCity(updatedAttraction.getCity());
            }


        }

    }

    public void deleteAttraction(String name) {
        int i =0;
        TouristAttraction Attraction;
        while (i<touristAttractions.size()) {
            if (name.equals(touristAttractions.get(i).getName())) {
                Attraction = touristAttractions.get(i);
                touristAttractions.remove(Attraction);


            }
            i++;
        }
    }

    public List<String> getTagsForAttraction(String name) {
        TouristAttraction attraction = getAttractionByName(name);
        if (attraction != null) {
            return attraction.getTags();
        } else
            return null;

    }

    public List<String> getCities() {
        return List.of("Copenhagen", "Nørrebro", "Østerbro", "Valby");
    }

    public List<String> getTags() {
        return List.of("Cheap", "Middle price", "Somewhat expensive", "Restaurant", "good for the price", "pricey", "cheap but good option", "Almost the best kebab");

    }
}