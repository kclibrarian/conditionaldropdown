package models;


public class Language {
//    Create variables
    private String id;
    private String name;
    private String designation;

    public Language() {

    }

    public Language(String id, String name, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }




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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

