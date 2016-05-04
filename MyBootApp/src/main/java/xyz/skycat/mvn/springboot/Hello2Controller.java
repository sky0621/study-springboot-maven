package xyz.skycat.mvn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2Controller {

	@RequestMapping("/two")
	public String two() {
		return "index2";
	}

	@RequestMapping("/redirectto")
	public String redirectto() {
		return "redirect:/two";
	}

	@RequestMapping("/forwardto")
	public String forwardto() {
		return "forward:/two";
	}

}
