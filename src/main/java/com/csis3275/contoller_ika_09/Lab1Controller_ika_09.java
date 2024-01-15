package com.csis3275.contoller_ika_09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_ika_09.Customer_ika_09;
import com.csis3275.model_ika_09.Employee_ika_09;

@Controller
public class Lab1Controller_ika_09 {

	@GetMapping("/")
	public String getResults(Model model) {

		// Initialize models
		Employee_ika_09 emp1 = new Employee_ika_09("Sam Hill");
		Customer_ika_09 cust1 = new Customer_ika_09("Ian Kariuki");
		
		
		
		model.addAttribute("customer",cust1);
		model.addAttribute("employee", emp1);
		model.addAttribute("customer_ticket",cust1.generateTicket());
		model.addAttribute("employee_ticket",emp1.generateTicket());
        
		return "AssignmentView_ika_09";
	}
}
