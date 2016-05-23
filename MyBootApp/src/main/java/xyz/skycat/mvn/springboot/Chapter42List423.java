package xyz.skycat.mvn.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Chapter42List423 {

	@RequestMapping("ch42list423/{tax}")
	public ModelAndView index(@PathVariable int tax, ModelAndView mav) {
		mav.setViewName("ch42list423");
		mav.addObject("msg", "current data.");
		List<DataObject> data = new ArrayList<>();
		data.add(new DataObject(0, "taro", "taro@flower"));
		data.add(new DataObject(1, "hanako", "hanako@flower"));
		data.add(new DataObject(2, "jiro", "jiro@flower"));

		mav.addObject("tax", tax);

		mav.addObject("data", data);
		return mav;
	}

}
