package xyz.skycat.mvn.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Chapter42List419 {

	@RequestMapping("ch42list419")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("ch42list419");
		mav.addObject("msg", "current data.");
		List<DataObject> data = new ArrayList<>();
		data.add(new DataObject(101, "taro", "taro@flower"));
		data.add(new DataObject(202, "hanako", "hanako@flower"));
		data.add(new DataObject(303, "jiro", "jiro@flower"));
		mav.addObject("data", data);
		return mav;
	}
	
}
