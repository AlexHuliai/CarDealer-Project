package app.entities;

public class Search {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Search(String model) {
        this.model = model;
    }
    public Search(){

    }
    public String toString(){
        return this.model;
    }
}
