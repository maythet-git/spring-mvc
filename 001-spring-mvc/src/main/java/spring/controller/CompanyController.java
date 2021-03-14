package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

	@GetMapping(value = {"/", "/home", "/index"})
	public String home(Model model) {
		
		model.addAttribute("welcomeMsg", "Welcome to SpringMVC Project");
		
		Company company = new Company();
		company.name = "GIC Japan";
		
		model.addAttribute("company", company);
		return "home";
	}
}
