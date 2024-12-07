package com.springcoredemo.hibernate_advanced_mappings.dao;

import com.springcoredemo.hibernate_advanced_mappings.entity.Instructor;
import com.springcoredemo.hibernate_advanced_mappings.entity.InstructorDetails;

public interface AppDao {
    void save(Instructor theinstructor);
    Instructor findById(int id);
    void delete(int id);
    InstructorDetails findDetailsById(int id);
    void deleteDetailsById(int id);
}
