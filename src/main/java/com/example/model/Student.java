package com.example.model;

public class Student {
    private Integer age;
    private String sex;
    private String name;
    private String id;
    public Student(){}
    public Student(Integer age,String sex,String name,String id){
        this.age=age;
        this.id=id;
        this.name=name;
        this.sex=sex;
    }
    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }



}