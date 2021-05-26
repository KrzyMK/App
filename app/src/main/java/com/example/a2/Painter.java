package com.example.a2;

public class Painter {
    private String name, surname;
    private boolean toDelete = false;
    private int picture;

    public Painter(String name, String surname, int picture) {
        this.name = name;
        this.surname = surname;
        this.picture = picture;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public boolean isToDelete() { return toDelete; }

    public void setToDelete(boolean toDelete) { this.toDelete = toDelete; }

    public int getPicture() { return picture; }

    public void setPicture(int picture) { this.picture = picture; }

}
