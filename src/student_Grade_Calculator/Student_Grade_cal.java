package student_Grade_Calculator;

import java.util.Scanner;

public class Student_Grade_cal {

	public static void main(String[] args) {
		int rollNo;
		float cgpa;
		String grade, name, dept, answer;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Your Rool Number : ");
			rollNo = sc.nextInt();
			System.out.println("Enter Your Name : ");
			name = sc.next();
			System.out.println("Enter Your Dept : ");
			dept = sc.next();
			System.out.println("Enter Your CGPA : ");
			cgpa = sc.nextFloat();

			if (cgpa < 9.0 && cgpa >= 8.0) {
				grade = "A";
			} else if (cgpa < 8.0 && cgpa >= 6.0) {
				grade = "B";
			} else if (cgpa < 6.0 && cgpa >= 5.0) {
				grade = "C";
			} else {
				grade = "D";
			}
			System.out.println("---------------------");
			System.out.println("---GRADE---");
			System.out.println("---------------------");
			System.out.println("Name:" + name);
			System.out.println("Roll No:" + rollNo);
			System.out.println("Dept:" + dept);
			System.out.println("CGPA:" + cgpa);
			System.out.println("Your Grade is:" + grade);
			System.out.println("Do you want to calculate Grade for another Student ? Yes or No");
			answer = sc.next();

		} while (answer.equals("Yes"));

	}

}
