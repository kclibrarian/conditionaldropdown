package models;


import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Language {
    private List<String> list;
    //    Create variables
    private String id;
    private String name;
    private String languages;
    private String language;
    Set<String> languageList;

    public Language() {

    }

    public Language(String id, String name, String language, Set<String>languageList, List<String>list) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.languageList = languageList;
        this.list = list;

    }

//    public Set<String> languageList () {
//        list = Arrays.asList(languageList.split(",", -1));
//
//        return languageList;
//    }


    //Getters and Setters
    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Set<String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Set<String> languageList) {
        this.languageList = languageList;
    }
}

