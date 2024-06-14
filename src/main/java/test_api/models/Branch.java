package test_api.models;

import java.util.HashMap;
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

@Data
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "branches")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Branch {
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String branchName;
	private String description;
	private String address;
	private List<Class> getClass;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Class> getGetClass() {
		return getClass;
	}
	public void setGetClass(List<Class> getClass) {
		this.getClass = getClass;
	}

}
