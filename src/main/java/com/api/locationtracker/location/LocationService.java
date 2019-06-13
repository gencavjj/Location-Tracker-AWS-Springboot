package com.api.locationtracker.location;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class LocationService {

    List<Location> findLocationHistory() {
        Location location = new Location(1,34.34379f,-117.19548f,new Date(),"230");
        return Collections.singletonList(location);
    }

}