package com.example.recycleviewfixbanget;

public class President {
    private int id;
    private  String name ;

    public President(int id, String name, int dateOfElection, String imageUrl) {
        this.id = id;
        this.name = name;
        this.dateOfElection = dateOfElection;
        this.imageUrl = imageUrl;
    }

    private int dateOfElection;
    private String imageUrl;

    @Override
    public String toString() {
        return "President{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfElection=" + dateOfElection +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfElection() {
        return dateOfElection;
    }

    public void setDateOfElection(int dateOfElection) {
        this.dateOfElection = dateOfElection;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
