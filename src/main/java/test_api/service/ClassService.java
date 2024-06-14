package test_api.service;

import java.util.List;

import test_api.models.Class;

public interface ClassService {

    public void create(Class classes);
    public List<Class> showAllClass();
    public Class findById(Integer id);
    public int update(Class classes);
    public void delete(Integer id);
    public List<Class> getSubjectByClass(Integer id);
} 
