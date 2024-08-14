package com.Iilika.sms.service;

import java.util.List;

import com.Iilika.sms.entity.Student;

public interface StudentService {

	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(long id);
	
	Student updateStudent(Student student);
	
	void deletStudentById(Long id);

}
