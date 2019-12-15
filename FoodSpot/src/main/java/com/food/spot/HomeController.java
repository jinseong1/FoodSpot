package com.food.spot;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	
	@RequestMapping("/about")
	public String mvAbout()throws Exception{
		return "/about";
	}
	
	@RequestMapping("/blog")
	public String mvBlog()throws Exception{
		return "/blog";
	}	
	
	@RequestMapping("contact")
	public String mvContact()throws Exception{
		return "/contact";
	}	
	
	@RequestMapping("/elements")
	public String mvElement()throws Exception{
		return "/element";
	}	
	
	@RequestMapping("/projectDetails")
	public String mvProjectDetaile()throws Exception{
		return "/project-details";
	}

	@RequestMapping("/project")
	public String mvProject()throws Exception{
		return "/project";
	}
	@RequestMapping("/service")
	public String mvService()throws Exception{
		return "/about";
	}
	@RequestMapping("/singleBlog")
	public String mvsSngleBlog()throws Exception{
		return "/single-blog";
	}
	
	
}
