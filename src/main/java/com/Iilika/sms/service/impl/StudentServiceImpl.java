package com.Iilika.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Iilika.sms.entity.Student;
import com.Iilika.sms.repository.StudentRepository;
import com.Iilika.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
	
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
			return studentRepository.save(student);
	}

	@Override
	public void deletStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	;
	
	

}
