package models;


public class Language {
//    Create variables
    private int id;
    private static int nextId = 1;

    private String name;
//    private String description;
//    private Language[] languages;

// Constructor
    public Language(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public Language() {

    }
    public int getId() {
        return id;
    }

//Getters and Setters
    public String getName() {
        return name;
    }
//    public String getDescription() { return description; }

//    public void setDescription(String code) {
//        this.description = description;
//    }
    public void setName(String name) {
        this.name = name;
    }



}

