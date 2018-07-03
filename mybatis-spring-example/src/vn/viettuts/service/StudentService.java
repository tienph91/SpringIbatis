package vn.viettuts.service;

import java.util.List;

import vn.viettuts.entity.Student;

public interface StudentService {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
}
