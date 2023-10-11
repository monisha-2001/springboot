package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
//	public CommandLineRunner commandLineRunner(String[] args){
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner-> {
//			System.out.println("Hello World");    //custom code

//			createStudent(studentDAO);

			createMultipleStudent(studentDAO);

//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			updateStudent(studentDAO);


			deleteStudent(studentDAO);

//			deleteAllStudent(studentDAO);
		};
		

	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("creating a new student object... ");
		Student tempStudent=new Student("monisha","B","monisha@gmail.com");

		//save the student object
		System.out.println("saving the student....");
		studentDAO.save(tempStudent);


		//display id of the saved student
		System.out.println("saved student generated id: "+tempStudent.getId());  //getid selects only id
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		System.out.println("creating a new student object... ");
		Student tempStudent1=new Student("monisha","B","monisha@gmail.com");
		Student tempStudent2=new Student("manoj","B","manoj@gmail.com");
		Student tempStudent3=new Student("gautham","R","gauthamonisha@gmail.com");

		System.out.println("saving the student....");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("creating a new student object... ");
		Student tempStudent=new Student("monisha","B","monisha@gmail.com");


		//save the student
		System.out.println("saving the student....");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theid=tempStudent.getId();
		System.out.println("saved student generated Id:" +theid);

		//reterieve student based on the id:primary key
		System.out.println("reterieveing student with id: "+theid);
		Student myStudent=studentDAO.findById(theid);

		//display student
		System.out.println("Found the student: "+myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of student
		List<Student> theStudents=studentDAO.findAll();

		//display the list of student
		for (Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}


	private void updateStudent(StudentDAO studentDAO) {
		//retrieve the student based on primary id
		int studentId=1;
		System.out.println("Getting the student with id: "+studentId);
		Student myStudent=studentDAO.findById(studentId);

		//change first name to "anjali"
		System.out.println("update student....");
		myStudent.setFirstName("anjali");

		//update the student
		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Updated student: "+myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=3;
		System.out.println("deleting student id: "+studentId);
		studentDAO.delete(studentId);
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("deleting all students");
		int numRowsDeleted=studentDAO.deleteAll();
		System.out.println("deleted row count: "+numRowsDeleted);
	}
}
