package HomeworkDay4.InterfaceAbstractDemo.entities;


import HomeworkDay4.InterfaceAbstractDemo.abstracts.Entity;

import java.time.LocalDate;

public class Customer implements Entity {

     private int id;
     private String firstName;
     private String lastName;
     private LocalDate birthOfDay;
     private String nationalityId;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, LocalDate birthOfDay, String nationalityId) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthOfDay(birthOfDay);
        this.setNationalityId(nationalityId);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(LocalDate birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}



