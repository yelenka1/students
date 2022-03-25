package telran.java41.students.dto.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

//@ResponseStatus(code=HttpStatus.NOT_FOUND,reason="student not found")
@ResponseStatus(HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class StudentNotFoundExeption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2827010495728344335L;
	
	StudentNotFoundExeption(Integer id){
		super("student with id = "+id+", not found");
	}
	

}
