package test_api.models;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import lombok.Data;

// @Data
//@Entity
//@Table(name = "semesters")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Semesters {
    private Integer id;
    private String semester;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

}
