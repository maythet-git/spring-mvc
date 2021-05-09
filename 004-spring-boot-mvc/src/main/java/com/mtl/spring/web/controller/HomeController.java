package com.mtl.spring.web.controller;

import static com.mtl.spring.common.Page.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = { "/", "/index", "/home" })
	public String callHome(Model model) {

		return HOME_PG;
	}

}