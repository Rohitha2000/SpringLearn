package com.pharmacy.jpa.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pharmacy.jpa.dto.SubjectDto;
import com.pharmacy.jpa.entity.Subject;

@Repository
public class SubjectDao {
    
	@Autowired
	private JpaTemplate jpaTemplate;
	
	
	@Transactional(readOnly = false)
	public void saveSubject(SubjectDto subjectDto) {
		Subject dao = new Subject();
		BeanUtils.copyProperties(subjectDto, dao);
		jpaTemplate.merge(dao);
		//entityManager.persist(dao);
	}

	public SubjectDto getSubject(int Id) {
		SubjectDto subjectDto = new SubjectDto();
		Subject subject = jpaTemplate.find(Subject.class, Id);
		BeanUtils.copyProperties(subject, subjectDto);
		return subjectDto;
	}
	
	

}
