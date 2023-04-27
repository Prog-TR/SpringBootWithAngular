package ca.sheridancollege.ranati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.ranati.beans.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
