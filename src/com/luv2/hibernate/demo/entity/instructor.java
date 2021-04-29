package com.luv2.hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name ="instructor")
public class instructor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    //map oneToone
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="instructor_detail_id")
    private instructorDetail insDetail;

    public instructor(){

    }
    public instructor(String firstName , String lastName , String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInsDetail(instructorDetail insDetail) {
        this.insDetail = insDetail;
    }

    public instructorDetail getInsDetail() {
        return insDetail;
    }

    @Override
    public String toString() {
        return "instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
