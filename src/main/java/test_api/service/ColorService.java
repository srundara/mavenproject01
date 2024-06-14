package test_api.service;

import java.util.List;

import test_api.models.Color;

public interface ColorService {
    public void create(Color color);
    public List<Color> list();
}
