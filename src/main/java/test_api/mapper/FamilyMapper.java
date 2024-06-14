package test_api.mapper;

import java.util.List;

import test_api.models.Family;

public interface FamilyMapper {
    public void create(Family family);
    public List<Family> getFamily();
    public Family getFamilyId(Integer id);
    public int upadte(Family family);
    public void delete(Integer id);

    public List<Family> getStudent(Integer id);
}
