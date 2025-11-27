package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false, unique = true)
	private String code;
	private Integer rating;

	@ManyToMany(mappedBy = "courseList")
	private Set<Student> studlist = new HashSet<Student>();

	public Course() {

	}

	public Course(String title, String code, Integer rating) {

		this.title = title;
		this.code = code;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Set<Student> getStudlist() {
		return studlist;
	}

	public void setStudlist(Set<Student> studlist) {
		this.studlist = studlist;
	}

}
