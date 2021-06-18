package com.capgemini.biodatacontroller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BioDataController {
	
	String emailid = "sneha@gmail.com";
	String mobileno="9932266705";
	String name="Sneha";
	@RequestMapping("/mobileno")
	public ModelAndView showMessage() {
		System.out.println("In Biodata Controller");
		ModelAndView mv=new ModelAndView("biodata");
		mv.addObject("mobileno",mobileno);
		
		return mv;
	}
	
	
	@RequestMapping("/myname")
	public ModelAndView showMyName() {
		System.out.println("In Biodata Controller");
		ModelAndView mv1=new ModelAndView("biodata");
		mv1.addObject("name",name);
		
		return mv1;
	}
	

}

