package com.sdabyd2.programowanie.Flowers;

public enum ColorOfFlowers {
    RED("czerwony"),YELLOW("żółty"),WHITE("biały");

    private String title;

    ColorOfFlowers(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
