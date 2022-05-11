package com.bj.pojo2;

public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("School无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
