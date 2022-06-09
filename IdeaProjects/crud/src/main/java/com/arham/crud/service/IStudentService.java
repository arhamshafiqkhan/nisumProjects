package com.arham.crud.service;
import com.arham.crud.dto.StudentDTO;
import com.arham.crud.model.Student;
import java.util.List;

public interface IStudentService {
    List<StudentDTO> saveStudentsList(List<StudentDTO> studentDTOList);
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentById(long id);
    StudentDTO getStudentByName(String name);
    String deleteStudent(long id);
    StudentDTO updateStudent(long id, StudentDTO studentDTO);
}
