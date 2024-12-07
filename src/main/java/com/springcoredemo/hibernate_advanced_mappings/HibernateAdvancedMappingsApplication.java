package com.springcoredemo.hibernate_advanced_mappings;

import com.springcoredemo.hibernate_advanced_mappings.dao.AppDao;
import com.springcoredemo.hibernate_advanced_mappings.entity.Instructor;
import com.springcoredemo.hibernate_advanced_mappings.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class HibernateAdvancedMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateAdvancedMappingsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){

return runner-> {

	//createInstructor(appDao);
	//findinstructor(appDao);
	//deleteinstructor(appDao);
	//findDetailsById(appDao);
deleteinstructorDetails(appDao);
};
	}

	private void deleteinstructorDetails(AppDao appDao) {
		int id=5;
		appDao.deleteDetailsById(id);
	}

	private void findDetailsById(AppDao appDao) {
	int id=1;
	InstructorDetails instructorDetails=appDao.findDetailsById(id);

		System.out.println("instructor deatials: "+instructorDetails);
		System.out.println("instructor: "+instructorDetails.getInstructor());

	}

	private void deleteinstructor(AppDao appDao) {
		int id=4;
		System.out.println("deleting the instructor of id "+ id);
appDao.delete(id);

	}

	private void findinstructor(AppDao appDao) {
	int id=2;
		Instructor instructor=appDao.findById(id);

		System.out.println("instructore data= " +instructor);
		System.out.println("intructor details= " + instructor.getInstructorDetails());

	}

	private void createInstructor(AppDao appDao) {
		Instructor instructor=new Instructor("mohamed","ossama","mohamed.ossama@gmail.com");
		InstructorDetails instructorDetails=new InstructorDetails("www.mohamedossama@youtube.com","padel");

		instructor.setInstructorDetails(instructorDetails);
		System.out.println("saving instructore"+ instructor);

		appDao.save(instructor);

		System.out.println("saved a new instructor");



	}


}
