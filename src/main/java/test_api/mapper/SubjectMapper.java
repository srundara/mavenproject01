package test_api.mapper;

import java.util.List;

import test_api.models.Subject;

public interface SubjectMapper {
	public void create(Subject subject);
	public List<Subject> getClassBySubject(Integer id);
}
