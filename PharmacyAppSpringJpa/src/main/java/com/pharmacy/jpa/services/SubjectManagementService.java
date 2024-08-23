package com.pharmacy.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pharmacy.jpa.dao.SubjectDao;
import com.pharmacy.jpa.dto.SubjectDto;

@Service
public class SubjectManagementService {

	@Autowired
	private SubjectDao subjectDao;

	@Transactional(readOnly = false)
	public void saveSubject(SubjectDto subjectDto) {
		subjectDao.saveSubject(subjectDto);
	}

	public SubjectDto getSubject(int Id) {
		SubjectDto subjectDto = subjectDao.getSubject(Id);
		return subjectDto;
	}
}
