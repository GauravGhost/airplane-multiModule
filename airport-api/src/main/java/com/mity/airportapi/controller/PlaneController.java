package com.mity.airportapi.controller;

import com.mity.airportapi.service.PlaneService;
import com.mity.airportcore.model.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaneController {
    @Autowired
    PlaneService planeService;

    @GetMapping(value = "/planes")
    public ResponseEntity<PlaneDto> getPlane() {
        PlaneDto planeDto = planeService.getPlane();
        return new ResponseEntity<>(planeDto, HttpStatus.OK);
    }

}
