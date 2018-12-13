package com.example.racheli.myapplication.model.backend;

import com.example.racheli.myapplication.model.datasource.Action;
import com.example.racheli.myapplication.model.datasource.Firebase_DBManager;
import com.example.racheli.myapplication.model.entities.Ride;

public interface Backend {
    void addRide(Ride ride, final Action<Long> action) throws Exception;
}
