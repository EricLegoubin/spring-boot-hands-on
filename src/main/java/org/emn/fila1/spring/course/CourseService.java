package org.emn.fila1.spring.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getCourses() {
		ArrayList<Course> courses = new ArrayList<>();
		for (Course c: courseRepository.findAll()) {
			courses.add(c);
		}
		return courses;
	}

	public Course getCourse(String id) {		
		return courseRepository.findOne(id);
	}

	public void addCourse(String id, Course course) {
		courseRepository.save(course);		
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);		
	}
}
