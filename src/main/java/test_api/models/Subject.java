package test_api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Subject {

	private Integer id;
	private String subject;
	private List<Class> getClass;
	public List<Class> getGetClass() {
		return getClass;
	}
	public void setGetClass(List<Class> getClass) {
		this.getClass = getClass;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
