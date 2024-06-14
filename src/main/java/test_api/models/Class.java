package test_api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @Entity
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "classes")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Class {

	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String className;
	private String description;
	private Integer branchId;
//	private Subject Subject; 
	private List<Branch> Branch;
	private List<Subject> Subject;
	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Subject> getSubject() {
		return Subject;
	}

	public void setSubject(List<Subject> subject) {
		Subject = subject;
	}

	public List<Branch> getBranch() {
		return Branch;
	}

	public void setBranch(List<Branch> branch) {
		Branch = branch;
	}

	
	

}
