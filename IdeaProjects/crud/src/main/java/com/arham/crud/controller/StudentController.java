package com.arham.crud.controller;

import com.arham.crud.dto.StudentDTO;
import com.arham.crud.mapper.StudentMapper;
import com.arham.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable long id) {
        return service.getStudentById(id);
    }

    @GetMapping("/{id}/{name}")
    public StudentDTO getStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    @PostMapping
    public List<StudentDTO> addStudentsList(@RequestBody List<StudentDTO> studentDTOList) {
        return service.saveStudentsList(studentDTOList);
    }

    @PutMapping("/{id}")
    public StudentDTO updateStudent(@PathVariable long id, @RequestBody StudentDTO studentDTO) {
        return service.updateStudent(id, studentDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id) {
        return service.deleteStudent(id);
    }
}
