package com.api.locationtracker.location;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/api/location-history")
    public ResponseEntity<List<Location>> findLocations() {
        List<Location> locations = locationService.findLocationHistory();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}