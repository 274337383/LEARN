package com.product.Template;

public class User implements Cloneable {
    private final int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
