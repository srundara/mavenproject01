package test_api.mapper;

// import java.util.HashMap;
import java.util.List;

import test_api.models.Branch;
// import test_api.models.Class;

public interface BranchMapper {
    public void create(Branch branch);
    public List<Branch> getAll();
    public Branch getBranchById(Integer id);
    public int update(Branch branch);
    public void delete(Integer id);
    public List<Branch> selectByName();

    public List<Branch> selectId(Integer id);
    // public List<HashMap<String, String>> getBranch();
}