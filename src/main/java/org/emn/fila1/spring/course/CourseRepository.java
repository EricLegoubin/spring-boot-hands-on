package org.emn.fila1.spring.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	List<Course> findByDescription(String description);
}
