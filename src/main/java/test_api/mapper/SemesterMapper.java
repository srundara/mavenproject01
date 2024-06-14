package test_api.mapper;

// import java.util.HashMap;
import java.util.List;
import test_api.models.Semesters;
// import test_api.models.Class;

public interface SemesterMapper {
    public void create(Semesters semester);
    public List<Semesters> get();
    public int update(Semesters semesters);
    public void delete(Integer id);
}