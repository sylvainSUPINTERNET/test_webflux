package com.monkatos.monkaw.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bumbleProfiles")
public class MockModel {
    @Id
    public String id;

    public String name;
    public String description;

    public Integer age;

    public String proTitle;
    public String citiesInfo;
    public String liveIn;
    public String from;
    public List<Hobby> hobbies;
    public List<Music> musics;

    public String createdAt;
    public String updatedAt;
    public String subKeyUsed;
    public String subSharedKeyUsed;
    public String pictureUrl;
}
