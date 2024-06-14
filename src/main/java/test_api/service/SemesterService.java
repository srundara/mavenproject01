package test_api.service;

import java.util.List;

import test_api.models.Semesters;

public interface SemesterService {
 public void create(Semesters semester);
 public List<Semesters> get();
 public int update(Semesters semesters);
 public void delete(Integer id);
}
