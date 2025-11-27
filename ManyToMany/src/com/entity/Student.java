package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false, unique = true)
	private String email;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "stud_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> courseList = new HashSet<Course>();

	public Student() {

	}

	public Student(String name, String email) {

		this.name = name;
		this.email = email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(Set<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public void addCourse(Course c) {
		// Here we are adding Course in Student Object
		this.getCourseList().add(c);
		
		// Here We are adding that student in Course Object
		c.getStudlist().add(this);
	}

}
