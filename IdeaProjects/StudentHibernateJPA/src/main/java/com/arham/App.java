package com.arham;

import com.arham.model.Course;
import com.arham.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

/*
        Student student1 = new Student(101, "Arham", "10", null);
        Student student2 = new Student(102, "Ibad", "9");
        Student student3 = new Student(103, "Murtaza", "11", null);
        Student student4 = new Student(104, "Abdul Qadeer", "8", null);
        Student student5 = new Student(105, "Sahal", "7", null);

        Course course1 = new Course(1, "Math", null);
        Course course2 = new Course(2, "CS", null);
        Course course3 = new Course(3, "English", null);

        List<Student> studentList1 = new ArrayList<>(); // we may also use set interface instead of List and hashSet instead of ArrayList
        List<Student> studentList2 = new ArrayList<>();

        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();

        studentList1.add(student1);
        studentList1.add(student3);
        studentList1.add(student5);

        studentList2.add(student1);
        studentList2.add(student2);
        studentList2.add(student4);

        courseList1.add(course1);
        courseList1.add(course2);
        courseList1.add(course3);

        courseList2.add(course1);
        courseList2.add(course3);

        student1.setCourses(courseList1);
        student2.setCourses(courseList2);

        course1.setStudents(studentList1);
        course2.setStudents(studentList2);

        entityManager.getTransaction().begin();

        entityManager.persist(student1);
        entityManager.persist(student2);
        entityManager.persist(student3);
        entityManager.persist(student4);
        entityManager.persist(student5);

        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);

        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        Student getStudent1 = (Student) entityManager.find(Student.class, 1);
        System.out.println(getStudent1);
        System.out.println(getStudent1.getCourses());

        // delete
        entityManager.remove(entityManager.find(Student.class, 3));

        entityManager.getTransaction().commit();


 */

        // update

        entityManager.getTransaction().begin();
        Student updateStudent = entityManager.find(Student.class, 5);

        updateStudent.setStudentName("Naved");
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


/*
        Student student = new Student();
        student.setId(1);
        student.setRollNo(101);
        student.setStudentName("Arham");
        student.setClassName("Masters");

        Course course = new Course();
        course.setId(1);
        course.setCourseName("Math");

 */

        // To save the object in database
/*

        entityManager.getTransaction().begin();
        entityManager.persist(student); // save the object
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();

        Course course = new Course();
        course.setCourseName("CS");

        Student student = new Student();
        student.setRollNo(102);
        student.setStudentName("Ibad");
        student.setClassName("11");
        student.getCourses().add(course);

        course.getStudents().add(student);

        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.persist(student);
        entityManager.getTransaction().commit();

 */

 /*
        List<Course> courseList =  new ArrayList<>();
        courseList.add(entityManager.find(Course.class, 1));
        courseList.add(entityManager.find(Course.class, 2));

        Student student2 = new Student();
        student2.setRollNo(103);
        student2.setStudentName("Abdul Qadeer");
        student2.setClassName("9");
        student2.setCourses(courseList);

        entityManager.getTransaction().begin();
        entityManager.persist(student2);
        entityManager.getTransaction().commit();


        // To get the object from database
        Student getStudent = entityManager.find(Student.class, 3);
        System.out.println(getStudent.toString());

        System.out.println(entityManager.find(Course.class, 3));

        entityManager.close();

  */
    }
}
