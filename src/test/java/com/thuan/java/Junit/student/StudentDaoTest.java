package com.thuan.java.Junit.student;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StudentDaoTest {
	private static StudentDao studentDao = new StudentDao();

//	static {
//		studentDao.insertStudent(new Student(1, "Alice", 20));
//		studentDao.insertStudent(new Student(2, "Bob", 22));
//	}

	@BeforeEach
	void setup() {
		System.out.println("Setup");
		studentDao = new StudentDao();
		studentDao.clearAllStudents();
		studentDao.insertStudent(new Student(1, "Alice", 20));
		studentDao.insertStudent(new Student(2, "Bob", 22));
	}

	@Test
	void testGetAllStudents() {
		List<Student> students = studentDao.getAllStudents();
		Assertions.assertEquals(2, students.size(), "Số lượng sinh viên không đúng");
	}

	@Test
	void testGetStudentById() {
		Optional<Student> student = studentDao.getStudentById(1);
		Assertions.assertTrue(student.isPresent(), "Không tìm thấy sinh viên có ID = 1");
		Assertions.assertEquals("Alice", student.get().getName(), "Tên sinh viên không đúng");
	}

	@RepeatedTest(10)
	@Test
	void testInsertStudent() {
		boolean result = studentDao.insertStudent(new Student(3, "Charlie", 25));
		Assertions.assertTrue(result, "Thêm sinh viên mới không thành công");
	}

	@Test
	void testUpdateStudent() {
		boolean result = studentDao.updateStudent(1, "Alicia", 21);
		Assertions.assertTrue(result, "Cập nhật sinh viên không thành công");

		Optional<Student> student = studentDao.getStudentById(1);
		Assertions.assertEquals("Alicia", student.get().getName(), "Tên sinh viên không được cập nhật đúng");
	}

	@Test
	void testDeleteStudent() {
		boolean result = studentDao.deleteStudent(1);
		Assertions.assertTrue(result, "Xóa sinh viên không thành công");

		Optional<Student> student = studentDao.getStudentById(1);
		Assertions.assertFalse(student.isPresent(), "Sinh viên vẫn tồn tại sau khi bị xóa");
	}
}
