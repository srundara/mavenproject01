package test_api.models;

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

// @Data
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "families")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Family {
    // @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fatherNme;
    private String motherName;
    private String phone;
    private String address;
    private Integer studentId;
    private List<Students> studentName;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFatherNme() {
        return fatherNme;
    }
    public void setFatherNme(String fatherNme) {
        this.fatherNme = fatherNme;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public List<Students> getStudentName() {
        return studentName;
    }
    public void setStudentName(List<Students> studentName) {
        this.studentName = studentName;
    }
    
}
