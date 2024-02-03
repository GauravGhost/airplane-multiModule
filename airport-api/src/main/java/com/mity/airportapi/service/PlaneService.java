package com.mity.airportapi.service;

import com.mity.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    public PlaneDto getPlane(){
        return new PlaneDto("jet Plane", 4);
    }
}
