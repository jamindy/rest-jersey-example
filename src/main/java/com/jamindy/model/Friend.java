package com.jamindy.model;

/**
 * Created by admin on 15-5-31.
 */
public class Friend extends Model{

    private String name;

    private int age;

    public Friend() {
        super();
    }

    public Friend(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
}
