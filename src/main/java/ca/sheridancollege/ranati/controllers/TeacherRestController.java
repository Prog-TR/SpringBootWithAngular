package ca.sheridancollege.ranati.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.ranati.beans.Teacher;
import ca.sheridancollege.ranati.services.TeacherService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/teachers")
public class TeacherRestController {
	
	private TeacherService tSrv;
	
	@GetMapping(value={"", "/"})
	public List<Teacher> getTeachers() {
		
		return tSrv.getTeachers();
	}
	
	@GetMapping("/{id}")
	public Teacher getTeachers(@PathVariable Long id) {
		
		return tSrv.getTeacherById(id);
	}
	
	@PostMapping(value={"", "/"})
	public Teacher addTeachers(@RequestBody Teacher teacher) {
		
		return tSrv.addTeacher(teacher);
	}

}
