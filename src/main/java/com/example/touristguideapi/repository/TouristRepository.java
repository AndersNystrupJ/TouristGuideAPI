package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private final List<TouristAttraction> touristAttractions = new ArrayList<>();

    public TouristRepository() {
        addAttraction();
    }

    public void addAttraction() {
        touristAttractions.add(new TouristAttraction("Rundetårn", "36m høj bygning på strøget. Bygget i 1600-tallet."));
        touristAttractions.add(new TouristAttraction("Den lille havfrue", "Lille bronzestatue i vandet ved langelinie. Illustrerer den lille havfrue fra H.C. Andersens eventyr."));
    }

    public List<TouristAttraction> getAllTouristAttractions() {
        return touristAttractions;
    }
}
