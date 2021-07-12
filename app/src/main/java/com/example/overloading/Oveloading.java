package com.example.overloading;

public class Oveloading {
    private String name;
    private String description;
    public Oveloading(){
        this("","");
    }

    public void elevatorPitch(){
        return;
    }

    public Oveloading(String name) {
        this.name = name;
    }

    public Oveloading(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
