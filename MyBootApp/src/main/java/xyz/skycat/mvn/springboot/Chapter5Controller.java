package xyz.skycat.mvn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xyz.skycat.mvn.springboot.repositories.MyDataRepository;

@Controller
public class Chapter5Controller {

	@Autowired
	MyDataRepository repository;

	@RequestMapping("/chap5")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("chap5");
		mav.addObject("msg", "this is sample content.");
		Iterable<MyData> list = repository.findAll();
		mav.addObject("data", list);
		return mav;
	}
}
