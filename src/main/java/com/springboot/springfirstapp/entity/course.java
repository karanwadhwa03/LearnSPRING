package com.springboot.springfirstapp.entity;

public class course {
    private int id;
    private String title;
    private String description;

    public course(int id,String title,String description){
        super();
        this.id=id;
        this.title=title;
        this.description=description;
    }

    public course(){
        super();
    }

    public void setTitle(String Title){
        this.title=Title;
        return ;
    }

    public void setId(int id){
        this.id=id;
        return ;
    }

    public void setDescription(String Description){
        this.description=Description;
        return ;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
