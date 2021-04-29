package com.luv2.hibernate.demo.entity;

import javax.persistence.*;

//annotate the class as entity and map dp
@Entity
@Table(name ="instructor_detail")
public class instructorDetail {

    //define the feilds
    //annotate the feilds with dp column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "youtube_channel")
    private String youtubeChannel;
    @Column(name = "hobby")
    private String hoppy;

    //create constructors
    public instructorDetail(){

    }
    public instructorDetail(String youtubeChannel , String hoppy){
        this.youtubeChannel = youtubeChannel;
        this.hoppy = hoppy;
    }
    //getter / setter

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setHoppy(String hoppy) {
        this.hoppy = hoppy;
    }

    public String getHoppy() {
        return hoppy;
    }
    //tostring method


    @Override
    public String toString() {
        return "instructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hoppy='" + hoppy + '\'' +
                '}';
    }
}
