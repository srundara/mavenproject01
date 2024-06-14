package test_api.service;

import java.util.List;

import test_api.models.Semesters;
import test_api.models.Subject;

public interface SubjectService {
 public void create(Subject subject);
 public List<Subject> getClassBySubject(Integer id);

}
