package com.dipper.apibookingflight.application.availableClass;


import com.dipper.apibookingflight.domain.availableClass.model.AvailableClass;

import java.util.List;

public interface AvailableClassService {

    List<AvailableClass> getAll();

    AvailableClass getAvailableClass(String id);

    AvailableClass createAvailableClass(AvailableClass availableClass);

    AvailableClass updateAvailableClass(AvailableClass availableClass);

    void deleteAvailableClass(String id);
}
