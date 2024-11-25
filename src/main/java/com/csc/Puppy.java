package com.csc;

class Puppy implements Cutie {
    private String description;
    private Integer cutenessRating;

    // Constructor 
    public Puppy(String description, Integer cutenessRating) {
        this.description = description;
        this.cutenessRating = cutenessRating;
    }

    public String description() {
        return description;
    }

    public Integer cutenessRating() {
        return cutenessRating;
    }
}
