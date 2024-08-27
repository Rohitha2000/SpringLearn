package com.pharmacy.jpa.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pharmacy.jpa.dao.SubjectDao;
import com.pharmacy.jpa.dto.SubjectDto;
import com.pharmacy.jpa.entity.Subject;
import com.pharmacy.jpa.repositories.SubjectRepository;

@Service
public class SubjectManagementService {

	@Autowired
	private SubjectRepository subjectRepository;

	@Transactional
	public void saveSubject(SubjectDto subjectDto) {
		Subject subject = new Subject();
		BeanUtils.copyProperties(subjectDto, subject);
		subjectRepository.save(subject);
	}

	public SubjectDto getSubject(int Id) {
		SubjectDto subjectDto = new SubjectDto();
		Subject subject = subjectRepository.findById(1).get();
		BeanUtils.copyProperties(subject, subjectDto);
		return subjectDto;
	}
}
