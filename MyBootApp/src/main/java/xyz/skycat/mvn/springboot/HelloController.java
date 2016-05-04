package xyz.skycat.mvn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/{num}")
	public ModelAndView indexNum(@PathVariable int num, ModelAndView model) {
		int res = 0;
		for (int i = 0; i < num; i++) {
			res += i;
		}
		model.addObject("msg", "total: " + res);
		model.setViewName("index");
		return model;
	}

}
