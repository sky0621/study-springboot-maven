package xyz.skycat.mvn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/three")
	public ModelAndView three(ModelAndView mav) {
		mav.setViewName("index2");
		mav.addObject("msg", "current data.");
		DataObject obj = new DataObject(123, "taro", "taro@dummy");
		mav.addObject("object", obj);
		return mav;
	}

	public class DataObject {
		public int id;
		public String name;
		public String mail;

		public DataObject(int id, String name, String mail) {
			this.id = id;
			this.name = name;
			this.mail = mail;
		}
	}

}
