package org.emn.fila1.spring.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}
	
	// GET /courses/{id}
	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	// PUT /courses/{id}
	@RequestMapping(method=RequestMethod.PUT, path="/courses/{id}")
	public void addCourse(@PathVariable String id, @RequestBody Course course) {
		courseService.addCourse(id, course);
	}
	
	// POST /courses/{id}
	@RequestMapping(method=RequestMethod.POST, path="/courses/{id}")
	public void updateCourse(@PathVariable String id, @RequestBody Course course) {
		courseService.updateCourse(id, course);
	}
	
	
	// DELETE /courses/{id}
	@RequestMapping(method=RequestMethod.DELETE, path="/courses/{id}")
	public void updateCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
}
