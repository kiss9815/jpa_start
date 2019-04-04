package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class BlogPost implements Serializable{

	@Id
	private Long id;
	
	@Column(name = "name", nullable = false)
    private String name;
}
