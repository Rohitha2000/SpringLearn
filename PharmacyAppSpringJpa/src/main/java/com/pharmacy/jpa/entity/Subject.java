package com.pharmacy.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "subject")
@Entity
public class Subject {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int Id;

	@Column(name = "subject_code")
	protected String subjectCode;

	@Column(name = "subject_name")
	protected String subjectName;
	@Column(name = "semester")
	protected String semester;
	@Column(name = "course")
	protected String course;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
