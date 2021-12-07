package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.application.availableClass.AvailableClassService;
import com.dipper.apibookingflight.domain.availableClass.model.AvailableClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
class AvailableClassApiController implements AvailableClassApi {

    @Autowired
    AvailableClassService availableClassService;

    @Override
    public ResponseEntity<List<AvailableClass>> getAvailableClassAll() {
        return new ResponseEntity<>(availableClassService.getAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AvailableClass> getAvailableClass(String id) {
        return new ResponseEntity<>(availableClassService.getAvailableClass(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AvailableClass> createAvailableClass(AvailableClass availableClass) {
        return new ResponseEntity<>(availableClassService.createAvailableClass(availableClass), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<AvailableClass> updateAvailableClass(AvailableClass availableClass) {
        return new ResponseEntity<>(availableClassService.updateAvailableClass(availableClass), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteAvailableClass(String id) {
        availableClassService.deleteAvailableClass(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
