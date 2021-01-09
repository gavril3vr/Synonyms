package com.example.synonyms;

public class Synonym {

    private int id;
    private final String synonym;

    public Synonym(String synonym) {
        this.synonym = synonym;
    }

    public String getSynonym() {
        return synonym;
    }
}
