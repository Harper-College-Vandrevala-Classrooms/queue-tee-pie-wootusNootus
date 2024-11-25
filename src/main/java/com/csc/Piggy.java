package com.csc;

class Piggy implements Cutie {
    private String description;
    private Integer cutenessRating;

    // Constructor
    public Piggy(String description, Integer cutenessRating) {
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

