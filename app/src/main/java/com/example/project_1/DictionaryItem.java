package com.example.project_1;

import java.util.ArrayList;

public class DictionaryItem {
    String word;
    ArrayList<String> definitions;
    ArrayList<String> synonyms;
    boolean favorite;

    public DictionaryItem(String word, ArrayList<String> definitions, ArrayList<String> synonyms, boolean favorite) {
        this.word = word;
        this.definitions = definitions;
        this.synonyms = synonyms;
        this.favorite = favorite;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(ArrayList<String> definitions) {
        this.definitions = definitions;
    }

    public ArrayList<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
