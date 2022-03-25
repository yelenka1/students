package telran.java41.student.service;

import java.util.List;

import telran.java41.students.dto.ScoreDto;
import telran.java41.students.dto.StudentCredentialsDto;
import telran.java41.students.dto.StudentDto;
import telran.java41.students.dto.UpdateStudentDto;

public interface StudentService {
	
	boolean addStudent(StudentCredentialsDto studentCredentialsDto);
	
	StudentDto findStudent(Integer id);
	
	StudentDto deleteStudent(Integer id);
	
	StudentCredentialsDto updateStudent(Integer id,UpdateStudentDto updateStudentDto);
	
	boolean addScore(Integer id,ScoreDto scoreDto);
	
	List<StudentDto>findStudentsByName(String name);
	
	long getStudentsNameQuantity(List<String>name);
	
	List<StudentDto>getStudentsByExamScore(String exam,int score);
	
	
	

}
