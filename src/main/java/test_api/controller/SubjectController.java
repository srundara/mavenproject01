package test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_api.models.Subject;
import test_api.service.SubjectService;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/create")
	private String create(@RequestBody Subject subject) {
		subjectService.create(subject);
		return "Success";
	}
	
	@GetMapping("/getClassBySubject")
	public List<Subject> getClassBySubject(@RequestBody Subject subject){
		return subjectService.getClassBySubject(subject.getId());
	}
}
