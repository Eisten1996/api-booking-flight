package com.dipper.apibookingflight.application.availableClass;

import com.dipper.apibookingflight.domain.availableClass.model.AvailableClass;
import com.dipper.apibookingflight.domain.availableClass.repository.AvailableClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailableClassServiceImpl implements AvailableClassService {


    @Autowired
    private AvailableClassRepository availableClassRepository;

    @Override
    public List<AvailableClass> getAll() {
        return availableClassRepository.findAll();
    }

    @Override
    public AvailableClass getAvailableClass(String id) {
        return availableClassRepository.findById(id).get();
    }

    @Override
    public AvailableClass createAvailableClass(AvailableClass availableClass) {
        return availableClassRepository.save(availableClass);
    }

    @Override
    public AvailableClass updateAvailableClass(AvailableClass availableClass) {
        return availableClassRepository.save(availableClass);
    }

    @Override
    public void deleteAvailableClass(String id) {
        availableClassRepository.deleteById(id);
    }
}
