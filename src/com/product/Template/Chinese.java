package com.product.Template;

public class Chinese extends User{
    private final int id;
    private String name;
    private final String country;

    public Chinese(int id, String name) {
        super(id, name);
        this.id = id;
        this.name = name;
        this.country = "China";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
