package xyz.skycat.mvn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		model.addAttribute("msg", num);
		return "index";
	}
}
