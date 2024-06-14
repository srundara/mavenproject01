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

import test_api.models.Family;
import test_api.service.FamilyService;

@RestController
@RequestMapping("/api/family")
public class FamilyController {
    @Autowired
    private FamilyService familyService;

    @PostMapping("/create")
    public String create(@RequestBody Family family){
         familyService.create(family);
         return "Create Success";
    }
    @GetMapping("/getFamily")
    public List<Family> get(){
        return familyService.getFamily();
    }
    @GetMapping("/getFamilyById")
    public Family getFamilyById(@RequestBody Family family){
       return familyService.getFamilyId(family.getId());
    }
    @PutMapping("/update")
    public String update(@RequestBody Family family){
        int data =familyService.upadte(family);
        if (data == 0) {
            return "Update Failed";
        }else{
            return "Update Success";
        }
    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody Family family){
        familyService.delete(family.getId());
        return "Delete Success";
    }

    @GetMapping("/findStudentByParent")
    public List<Family> findStudentByParent(@RequestBody Family family){
        return familyService.getStudent(family.getId());
    }
}
