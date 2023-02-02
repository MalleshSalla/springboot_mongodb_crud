package com.cg.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "student")
public class Student {
	
	@Id
	private long id;
	private String name;
	private double age;
	private int grade;
	
	
}
