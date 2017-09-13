package in.spring4buddies.application.rest.controller;

import in.spring4buddies.application.rest.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("employees")
public class EmployeeController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	public @ResponseBody Employee getEmployee(@PathVariable String name) {
		return new Employee(name);
	}
}