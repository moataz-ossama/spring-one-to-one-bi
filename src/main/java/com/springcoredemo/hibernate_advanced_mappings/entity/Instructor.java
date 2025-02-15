package com.springcoredemo.hibernate_advanced_mappings.entity;

import jakarta.persistence.*;
//ta3del alhany cany
@Entity
@Table(name = "instructor")
public class Instructor {



   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column(name = "id")
private int id;
   @Column(name = "first_name_999")
private String firstName;
   @Column(name = "0")
private String lastName;


   @Column(name = "email_1")
private String email;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "instructor_detail_i_d")
private InstructorDetails instructorDetails;

   public Instructor (){}

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InstructorDetails getInstructorDetails() {
        return instructorDetails;
    }

    public void setInstructorDetails(InstructorDetails instructorDetails) {
        this.instructorDetails = instructorDetails;
    }
// ta3delat hany cany 2
    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", instructorDetails=" + instructorDetails +
                '}';
    }
}
