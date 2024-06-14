package test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_api.models.Class;
import test_api.service.ClassService;

@RestController
@RequestMapping("/api/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping("/create")
    public String create(@RequestBody Class data){
       classService.create(data);
        return "Success";
    }

    @GetMapping("/getBranch")
    public List<Class> getAll(){
        return classService.showAllClass();
    }

    @PostMapping("/post")
    public ResponseEntity<Void> createUser(@RequestBody Class data) {
        classService.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getClassById")
    public Class  getClass(@RequestBody Class data){
        return classService.findById(data.getId());
    }

    @PutMapping("/update")
    public String update(@RequestBody Class data){
        int datas = classService.update(data);
        if(datas == 0){
            return "Update Failed";
        }else{
            return "Update Success";
        }
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Class data){
        classService.delete(data.getId());
        return "Success Delete";
    }
    
    @GetMapping("/getClass")
    public List<Class> get(@RequestBody Class data){
    	return classService.getSubjectByClass(data.getId());
    }
}
