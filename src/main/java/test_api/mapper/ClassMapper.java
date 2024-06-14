package test_api.mapper;

import java.util.List;

import test_api.models.Branch;
import test_api.models.Class;

public interface ClassMapper {
    public void create(Class classes);
    public List<Class> showAllClass();
    public Class findById(Integer id);
    public int update(Class classes);
    public void delete(Integer id);
    public List<Class> getSubjectByClass(Integer id);
}
