package in.spring4buddies.application.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Employee {

	private String name;
	private String email;

	public Employee() {
	}

	public Employee(String name) {
		this.name = name;
		this.email = name + "@spring4buddies.in";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}