package ca.sheridancollege.ranati.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.ranati.beans.Teacher;
import ca.sheridancollege.ranati.repositories.TeacherRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {

	private TeacherRepository tRepo;
	
	@Override
	public List<Teacher> getTeachers() {
		
		return tRepo.findAll();
	}

	@Override
	public Teacher getTeacherById(Long id) {
		
		if(tRepo.findById(id).isPresent())
		return tRepo.findById(id).get();
		
		return new Teacher();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return tRepo.save(teacher);
	}

}
