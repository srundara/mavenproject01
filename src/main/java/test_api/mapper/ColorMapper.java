package test_api.mapper;

import java.util.List;

import test_api.models.Color;

public interface ColorMapper {
    
    public void create(Color color);
    public List<Color> list();
}
