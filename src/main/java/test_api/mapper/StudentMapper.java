package test_api.mapper;


import java.util.List;

import test_api.models.Students;

public interface StudentMapper {
	public void create(Students students);
	public List<Students> getStudent();
	public Students getStudentById(Integer id);
	public int update(Students students);
	public void delete(Integer id);
}
