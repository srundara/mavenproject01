package test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_api.models.Students;
import test_api.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public String create(@RequestBody Students students){
        studentService.create(students);
        return "Success";
    }

    @GetMapping("/getStudent")
    public List<Students> get(){
        return studentService.getStudent();
    }

    @GetMapping("/getStudentById")
    public Students getStudentById(@RequestBody Students students){
       return studentService.getStudentById(students.getId());
    }

    @PutMapping("/update")
    public String update(@RequestBody Students students){
        int student = studentService.update(students);
        if (student == 0) {
            return "Update Failed";
        }else{
            return "Update Success";
        }
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Students students){
        studentService.delete(students.getId());
        return "Delete Success";
    }
}
