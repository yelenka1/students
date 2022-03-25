package telran.java41.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import telran.java41.student.service.StudentService;
import telran.java41.students.dto.ScoreDto;
import telran.java41.students.dto.StudentCredentialsDto;
import telran.java41.students.dto.StudentDto;
import telran.java41.students.dto.UpdateStudentDto;

@RestController
@AllArgsConstructor
public class StudentController {
	
	StudentService studentService;
	
	

	@PostMapping("/student")
	public boolean studentRegidter(@RequestBody StudentCredentialsDto studentCredentialsDto) {
		return studentService.addStudent(studentCredentialsDto);
	}
	
	@GetMapping("/student/{id}")
	public StudentDto findStudentById(@PathVariable("id")Integer StudentId) {
		return studentService.findStudent(StudentId);
	}
	
	@DeleteMapping("/student/{id}")
	public StudentDto removeStudent(@PathVariable Integer id) {
		return studentService.deleteStudent(id);
	}
	
	@PutMapping("/student/{id}")
	public StudentCredentialsDto editStudent(@PathVariable Integer id,@RequestBody UpdateStudentDto updateStudentDto) {
		return studentService.updateStudent(id,updateStudentDto);
	}
	
	@PutMapping("/score/student/{id}")
	public boolean addScore(@PathVariable Integer id,@RequestBody ScoreDto scoreDto) {
		return studentService.addScore(id, scoreDto);
	}
	
	@GetMapping("/students/name/{name}")
	public List<StudentDto>findStudentsByName(@PathVariable String name){
		return studentService.findStudentsByName(name);
	}
	
	@PostMapping("/quantity/students")
	public long studentsNamesQuantity(@RequestBody List<String> names) {
		return studentService.getStudentsNameQuantity(names);
	}

	@GetMapping("/students/exam/{exam}/minscore/{score}")
	public List<StudentDto> studentsByExamScore(@PathVariable String exam, @PathVariable int score) {
		return studentService.getStudentsByExamScore(exam, score);
	}

}
