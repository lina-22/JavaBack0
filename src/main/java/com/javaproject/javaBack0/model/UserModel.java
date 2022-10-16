package com.javaproject.javaBack0.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @Column(name = "id", nullable = false )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false )
    String firstName;
    @Column(name = "last_name", nullable = false )
    String lastName;
    @Column(name = "email", nullable = false )
    String email;
    @Column(name = "password", nullable = false )
    String password;
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
