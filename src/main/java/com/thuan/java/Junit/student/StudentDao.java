package com.thuan.java.Junit.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDao {
	// Giả lập "database" bằng List static
	private static List<Student> students = new ArrayList<>();

	// Create: Thêm sinh viên vào danh sách
	public boolean insertStudent(Student student) {
		return students.add(student);
	}

	// Read: Lấy danh sách tất cả sinh viên
	public List<Student> getAllStudents() {
		return new ArrayList<>(students); // Trả về một bản sao của danh sách
	}

	// Read: Tìm sinh viên theo ID
	public Optional<Student> getStudentById(int id) {
		return students.stream().filter(s -> s.getId() == id).findFirst();
	}

	// Update: Cập nhật thông tin sinh viên
	public boolean updateStudent(int id, String newName, int newAge) {
		Optional<Student> studentOpt = getStudentById(id);
		if (studentOpt.isPresent()) {
			Student student = studentOpt.get();
			student.setName(newName);
			student.setAge(newAge);
			return true;
		}
		return false;
	}

	// Delete: Xóa sinh viên theo ID
	public boolean deleteStudent(int id) {
		return students.removeIf(s -> s.getId() == id);
	}

	public void clearAllStudents() {
		students.clear();
	}
}
