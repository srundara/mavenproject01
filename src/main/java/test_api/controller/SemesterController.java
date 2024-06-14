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

import test_api.models.Semesters;
import test_api.service.SemesterService;

@RestController
@RequestMapping("/api/semester")
public class SemesterController {
	@Autowired
	private SemesterService semesterService;
	@PostMapping("/create")
	public String create(@RequestBody Semesters semester) {
		semesterService.create(semester);
		return "Success";
	}
	
	@GetMapping("/get")
	public List<Semesters> get(){
		return semesterService.get();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Semesters semesters) {
		int data = semesterService.update(semesters);
		if(data == 0) {
			return "Failed to Update";
		}else {
			return "Update Success";
		}
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody Semesters semesters) {
		semesterService.delete(semesters.getId());
		return "Delete Success";
	}
}
