package com.model;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="person")
@Entity   //加入这个注解，Person就会进行持久化
public class Person {
 @Id @GeneratedValue
 private Integer id;
 private String name;
 private Integer age;

 public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getAge() {
         return age;
     }

     public void setAge(Integer age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return
                 "id=" + id +
                         ", name='" + name + '\'' +
                         ", age=" + age
                 ;
     }
 }