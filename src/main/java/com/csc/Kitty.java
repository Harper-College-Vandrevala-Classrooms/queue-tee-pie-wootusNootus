package com.csc;

class Kitty implements Cutie {
    private String description;
    private Integer cutenessRating;

    // Constructor for the Kitty class
    public Kitty(String description, Integer cutenessRating) {
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
