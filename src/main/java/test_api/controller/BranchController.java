package test_api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import test_api.models.Branch;
import test_api.models.Class;
import test_api.service.BranchService;
import test_api.service.ClassService;
// import test_api.service.impl.BranchAndClassImpl;

@RestController
@RequestMapping("/api/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;
    @Autowired 
    public ClassService classService;
    // private BranchAndClassImpl branchAndClassImpl;
    
    @PostMapping("/create")
    public String create(@RequestBody Branch branch){
        branchService.create(branch);
        return "Success";
    }

    @GetMapping("/getBranch")
    public List<Branch> getAll(){
        return branchService.getAll();
    }

    @GetMapping("/getBranchById")
    public Branch getBranchById(@RequestBody Branch branch){
        return branchService.getBranchById(branch.getId());
    }

    @PutMapping("/update")
    public String upadte(@RequestBody Branch branch){
        int data = branchService.update(branch);
        if (data == 0) {
            return "Update failed";
        }else{
            return  "Update Success";
        }
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Branch branch){
        branchService.delete(branch.getId());
        return "Delete Success";
    }

  @GetMapping("/all")
  public List<Branch> get(){
    return branchService.selectByName();
  }
  @GetMapping("/selectId")
  public List<Branch> selectId(@RequestBody Branch branch){
    return branchService.selectId(branch.getId());
  }

//   @GetMapping("/")
//   public 

  @GetMapping("/data")
    public ResponseEntity<Map<String, List<? extends Object>>> getAllData() {
        Map<String, List<? extends Object>> data = new HashMap<>();

        List<Branch> branches = branchService.getAll();
        List<Class> classes = classService.showAllClass();

        data.put("branches", branches);
        data.put("classes", classes);

        // return data;

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}