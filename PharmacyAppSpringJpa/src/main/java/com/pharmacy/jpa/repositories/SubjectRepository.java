package com.pharmacy.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmacy.jpa.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
