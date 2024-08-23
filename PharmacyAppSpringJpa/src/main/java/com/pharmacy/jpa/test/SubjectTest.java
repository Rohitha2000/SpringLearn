package com.pharmacy.jpa.test;

import javax.persistence.criteria.Root;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pharmacy.jpa.config.RootConfig;
import com.pharmacy.jpa.dto.SubjectDto;
import com.pharmacy.jpa.services.SubjectManagementService;

public class SubjectTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);

		SubjectManagementService subjectManagementService = applicationContext.getBean(SubjectManagementService.class);

		SubjectDto subjectDto = subjectManagementService.getSubject(1);
		System.out.println(subjectDto);
		
		SubjectDto dto=new SubjectDto();
		dto.setCourse("MCA");
		dto.setSemester("4");
		dto.setSubjectCode("MCA6926");
		dto.setSubjectName("DSA");
		
		subjectManagementService.saveSubject(subjectDto);
	}

}
