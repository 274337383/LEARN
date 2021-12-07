package com.product.java;

import java.util.Objects;

public class Test05 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object o1 = new User("张三", new Address("漳州", "朝阳镇漳滨村294号", "363000"));
        Object o2 = new User("李四", new Address("漳州", "朝阳镇漳滨村24号", "363500"));
        User user = new User("张三", new Address("漳州", "朝阳镇漳滨村294号", "363000"));

        User o3 = (User) user.clone();

        System.out.println("修改前:"+user.toString()+"\n"+o3.toString());

        o3.setName("李四");
        o3.setAddress(new Address("深圳", "xxx", "46000"));
        System.out.println("修改后:"+user.toString()+"\n"+o3.toString());

    }
}

class User implements Cloneable {
    String name;
    Address address;

    @Override
    public String toString() {
        return this.hashCode()+this.name+"\n"+this.address.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        if (this == obj) return true;
        User u = (User) obj;
        return this.name.equals(u.name) && this.address.equals(u.address);
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(this.toString()+"对象将被销毁!");
    }
}

class Address {
    String city;
    String street;
    String zipCode;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipCode, address.zipCode);
    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return this.city+"/"+this.street+"/"+this.zipCode;
    }
}
