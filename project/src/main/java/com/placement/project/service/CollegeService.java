package com.placement.project.service;

import com.placement.project.model.College;
import java.util.List;

public interface CollegeService {
    College addCollege(College college);
    List<College> getAllColleges();
    College getCollegeById(Long id);
    College updateCollege(Long id, College college);
    void deleteCollege(Long id);
}