package org.spring.series.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class AnnotationHelloWorldController {

	@RequestMapping(value="/firstmvc", method=RequestMethod.GET)
	public ModelAndView firstMvcController(){
        ModelAndView modelAndView = new ModelAndView("showMessage");
        modelAndView.addObject("message", "Welcome To Spring MVC Annotation based web application");
        return modelAndView;
	}
}
