package com.example.StudentDB.Controller;

import com.example.StudentDB.Model.Student;
import com.example.StudentDB.RequestDTO.StudentDTO;
import com.example.StudentDB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentDTO studentDTO){
       return studentService.addStudent(studentDTO);
    }

    @GetMapping("/getById")
    public Student getStudent(@RequestParam("id")Integer id){
        return studentService.getStudent(id);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id")Integer id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update")
    public String updateStudent(@PathVariable("id")Integer id,@RequestBody StudentDTO studentDto){
       return studentService.updateStudent(id, studentDto);
    }
}
