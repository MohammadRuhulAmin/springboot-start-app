package com.example.demo;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.Alien;

@Controller
public class HomeController {
	
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req , HttpServletResponse res) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("Home... " + name);
//		session.setAttribute("name", name);
//		return "home";
//		
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String name ) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",name);
//		mv.setViewName("home");
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
		
	}
	
	
	
	@RequestMapping("about")
	public String about() {
		return "about";
	}
}
