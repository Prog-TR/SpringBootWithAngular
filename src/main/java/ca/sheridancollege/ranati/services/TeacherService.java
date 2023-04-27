package ca.sheridancollege.ranati.services;

import java.util.List;

import ca.sheridancollege.ranati.beans.Teacher;

public interface TeacherService {

	public List<Teacher> getTeachers();
	public Teacher getTeacherById(Long id);
	public Teacher addTeacher(Teacher teacher);
}
