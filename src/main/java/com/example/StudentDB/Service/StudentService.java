package com.example.StudentDB.Service;

import com.example.StudentDB.Model.Student;
import com.example.StudentDB.Repository.StudentRepository;
import com.example.StudentDB.RequestDTO.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(StudentDTO studentDTO){
        try{
            Student student = new Student();
            student.setName(studentDTO.getName());
            student.setClass(studentDTO.getClass());
            student.setAddress(studentDTO.getAddress());

            studentRepository.save(student);

            return "Successfully saved";
        }catch (Exception e){
            return "Not added something wrong";
        }
    }

    public Student getStudent(Integer id){
       try{
           return studentRepository.findById(id).get();
       }catch (Exception e){
           // when student not found of given id
           return null;
       }
    }

    public String deleteStudent(Integer id){
       try{
           studentRepository.deleteById(id);

           return "Successfully deleted";
       }catch(Exception e){
           return "Student of this id is not found";
       }
    }

    public String updateStudent(Integer id,StudentDTO studentDTO){
        try{
              Student student = studentRepository.findById(id).get();
              student.setName(studentDTO.getName());
              student.setClass(studentDTO.getClass());
              student.setAddress(studentDTO.getAddress());

              studentRepository.save(student);

            return "Successfully updated";
        }catch (Exception e){
            return "not available of this id";
        }
    }
}
