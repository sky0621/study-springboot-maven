package xyz.skycat.mvn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Chapter41List47 {

	@RequestMapping("/ch41list47")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("ch41list47");
		mav.addObject("msg", "current data.");
		DataObject obj = new DataObject(123, "hanako", "hanako@flower");
		mav.addObject("object", obj);
		return mav;
	}
}
