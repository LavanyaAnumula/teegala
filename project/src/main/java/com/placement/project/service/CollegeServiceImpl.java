package com.placement.project.service;


import com.placement.project.model.College;
import com.placement.project.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepo collegeRepo;

    @Override
    public College addCollege(College college) {
        return collegeRepo.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    @Override
    public College getCollegeById(Long id) {
        return collegeRepo.findById(id).orElse(null);
    }

    @Override
    public College updateCollege(Long id, College updatedCollege) {
        College existing = collegeRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setCollegeName(updatedCollege.getCollegeName());
            existing.setLocation(updatedCollege.getLocation());
            existing.setCollegeAdmin(updatedCollege.getCollegeAdmin());
            return collegeRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCollege(Long id) {
        collegeRepo.deleteById(id);
    }
}