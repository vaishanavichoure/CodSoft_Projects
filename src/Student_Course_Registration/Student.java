package Student_Course_Registration;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	    private int studentID;
	    private String name;
	    private List<Course> registeredCourses;

	    public Student(int studentID, String name) {
	        this.studentID = studentID;
	        this.name = name;
	        this.registeredCourses = new ArrayList<>();
	    }

	    public int getStudentID() {
	        return studentID;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Course> getRegisteredCourses() {
	        return registeredCourses;
	    }

	    public void registerCourse(Course course) {
	        if (course.registerStudent()) {
	            registeredCourses.add(course);
	            System.out.println("Course registered: " + course.getTitle());
	        } else {
	            System.out.println("Course is full: " + course.getTitle());
	        }
	    }

	    public void dropCourse(Course course) {
	        if (registeredCourses.contains(course)) {
	            course.dropStudent();
	            registeredCourses.remove(course);
	            System.out.println("Course dropped: " + course.getTitle());
	        } else {
	            System.out.println("Course not found: " + course.getTitle());
	        }
	    }
	}

	
	    

