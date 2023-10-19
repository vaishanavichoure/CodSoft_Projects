package Student_Course_Registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Course {


	    private String code;
	    private String title;
	    private String description;
	    private int capacity;
	    private String schedule;
	    private int availableSlots;

	    public Course(String code, String title, String description, int capacity, String schedule) {
	        this.code = code;
	        this.title = title;
	        this.description = description;
	        this.capacity = capacity;
	        this.schedule = schedule;
	        this.availableSlots = capacity;
	    }

	    public String getCode() {
	        return code;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public String getSchedule() {
	        return schedule;
	    }

	    public int getAvailableSlots() {
	        return availableSlots;
	    }

	    public boolean registerStudent() {
	        if (availableSlots > 0) {
	            availableSlots--;
	            return true;
	        }
	        return false;
	    }

	    public void dropStudent() {
	        if (availableSlots < capacity) {
	            availableSlots++;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Course Code: " + code + "\n" +
	               "Title: " + title + "\n" +
	               "Description: " + description + "\n" +
	               "Available Slots: " + availableSlots + "/" + capacity + "\n" +
	               "Schedule: " + schedule;
	    }
	}

	