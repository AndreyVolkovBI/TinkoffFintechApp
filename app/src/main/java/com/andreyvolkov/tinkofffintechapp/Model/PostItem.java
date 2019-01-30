package com.andreyvolkov.tinkofffintechapp.Model;

public class PostItem {
    private String name;
    private String description;
    private String exams;
    private String places;

    public PostItem(String name, String description, String exams, String places) {
        this.name = name;
        this.description = description;
        this.exams = exams;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getExams() {
        return exams;
    }

    public String getPlaces() {
        return places;
    }
}
