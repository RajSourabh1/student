package com.example.StudentDB.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String Address;

    private String Class;
}
