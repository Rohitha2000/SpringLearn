package com.pharmacy.jpa.dto;

public class SubjectDto {

	private String subjectCode;

	private String subjectName;

	private String semester;

	private String course;

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

	@Override
	public String toString() {
		return "SubjectDto [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", semester=" + semester
				+ ", course=" + course + "]";
	}

}
