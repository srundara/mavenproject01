package test_api.service;

// import java.util.HashMap;
import java.util.List;

import test_api.models.Branch;
import test_api.models.Class;

public interface BranchService {
	public List<Branch> getAll();
	public void create(Branch branch);
	public Branch getBranchById(Integer id);
	public int update(Branch branch);
	public void delete(Integer id);
	public List<Branch> selectByName();
	public List<Branch> selectId(Integer id);
}
