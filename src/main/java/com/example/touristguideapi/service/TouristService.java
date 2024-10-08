package com.example.touristguideapi.service;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAllTouristAttractions() {
        return touristRepository.getAllTouristAttractions();
    }
    //GETMAPPING-ATTRACTION{NAME}
    public TouristAttraction findAttractionByName(String name) {
        return touristRepository.findAttractionByName(name);
    }

    //POSTMAPPING
    public TouristAttraction addTouristAttraction(TouristAttraction touristAttraction){
        return touristRepository.addAttraction(touristAttraction);
    }

    public TouristAttraction updateAttraction(TouristAttraction touristAttraction){
       touristRepository.updateAttraction(touristAttraction);
       return touristAttraction;
    }

    public boolean deleteTouristAttractionByName(String name) {
        List<TouristAttraction> attractions = getAllTouristAttractions();

        // Find the attraction by name and remove it
        return attractions.removeIf(attraction -> attraction.getName().equalsIgnoreCase(name));
    }




}
