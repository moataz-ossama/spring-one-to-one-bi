package com.springcoredemo.hibernate_advanced_mappings.dao;

import com.springcoredemo.hibernate_advanced_mappings.entity.Instructor;
import com.springcoredemo.hibernate_advanced_mappings.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppDaoImpl implements AppDao{
    EntityManager entityManager;


    @Autowired
    public AppDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }





    @Override
@Transactional
    public void save(Instructor theinstructor) {
    entityManager.persist(theinstructor);
    }

    @Override
    public Instructor findById(int id) {
        Instructor instructor=entityManager.find(Instructor.class,id);


        return instructor;

    }

    @Override
@Transactional
    public void delete(int id) {
        Instructor instructor=entityManager.find(Instructor.class,id);

          entityManager.remove(instructor);
    }

    @Override
    public InstructorDetails findDetailsById(int id) {
        InstructorDetails instructorDetails=entityManager.find(InstructorDetails.class,id);
        return instructorDetails;
    }

    @Override
    @Transactional
    public void deleteDetailsById(int id) {
        InstructorDetails instructorDetails=entityManager.find(InstructorDetails.class,id);
instructorDetails.getInstructor().setInstructorDetails(null);
        entityManager.remove(instructorDetails);

    }
}
