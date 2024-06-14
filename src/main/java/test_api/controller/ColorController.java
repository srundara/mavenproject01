package test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_api.models.Color;
import test_api.service.ColorService;

@RestController
@RequestMapping("/api/color")
public class ColorController {
    @Autowired
    private ColorService colorService;

    @PostMapping("/create")
    public String create(@RequestBody Color color){
        colorService.create(color);
        return "Success";
    }
    @GetMapping("/get")
    public List<Color> list(){
        return colorService.list();
    }
}
