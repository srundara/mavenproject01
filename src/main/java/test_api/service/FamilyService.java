package test_api.service;

import java.util.List;

import test_api.models.Family;

public interface FamilyService {
    
    public void create(Family family);
    public List<Family> getFamily();
    public Family getFamilyId(Integer id);
    public int upadte(Family family);
    public void delete(Integer id);
    public List<Family> getStudent(Integer id);
}
