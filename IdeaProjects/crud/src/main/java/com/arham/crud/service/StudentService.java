package com.arham.crud.service;

import com.arham.crud.dto.StudentDTO;
import com.arham.crud.mapper.StudentMapper;
import com.arham.crud.repository.StudentRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<StudentDTO> saveStudentsList(List<StudentDTO> studentDTOList) {
        return mapper.toStudentDTO(studentRepo.saveAll(mapper.toStudent(studentDTOList)));
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return mapper.toStudentDTO(studentRepo.findAll());
    }

    @Override
    public StudentDTO getStudentById(long id) {
        return mapper.toStudentDTO(studentRepo.findById(id).orElse(null));
    }

    @Override
    public StudentDTO getStudentByName(String name) {
        return mapper.toStudentDTO(studentRepo.findByName(name));
    }

    @Override
    public String deleteStudent(long id) {
        if (studentRepo.findById(id).isPresent())
            studentRepo.deleteById(id);
        else
            return "Student with id = " + id + " is not present!";
        return "Student with id = " + id + " is successfully deleted!";
    }

    @Override
    public StudentDTO updateStudent(long id, StudentDTO studentDTO) {
        StudentDTO updateStudent = mapper.toStudentDTO(studentRepo.findById(id).orElse(null));
        updateStudent.setName(studentDTO.getName());
        updateStudent.setClassName(studentDTO.getClassName());
        studentRepo.save(mapper.toStudent(updateStudent));
        return updateStudent;
    }

}
