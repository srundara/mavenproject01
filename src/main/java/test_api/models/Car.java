package test_api.models;

import java.time.Year;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "cars")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Car {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Setter()
    private Integer id;
    private String car;
    // private Color color;
    // private Integer colorId;
    private List<Color> colors;
    // private Year make;
    public Integer getId() {
        return id;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public List<Color> getColors() {
        return colors;
    }
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

}
