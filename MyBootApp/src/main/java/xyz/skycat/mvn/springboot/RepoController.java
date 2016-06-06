package xyz.skycat.mvn.springboot;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xyz.skycat.mvn.springboot.repositories.MyDataRepository;

@Controller
public class RepoController {

	@Autowired
	MyDataRepository repository;

	@RequestMapping(value = "/repo", method = RequestMethod.GET)
	public ModelAndView index(@ModelAttribute("formModel") MyData mydata, ModelAndView mav) {
		mav.setViewName("repo");
		mav.addObject("msg", "this is sample repository.");
		List<MyData> list = repository.findAll();
		mav.addObject("datalist", list);
		return mav;
	}

	@RequestMapping(value = "/repo", method = RequestMethod.POST)
	@Transactional(readOnly = false)
	public ModelAndView form(@ModelAttribute("formModel") MyData mydata, ModelAndView mav) {
		repository.saveAndFlush(mydata);
		return new ModelAndView("redirect:/repo");
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute MyData mydata, @PathVariable int id, ModelAndView mav) {
		mav.setViewName("edit");
		mav.addObject("title", "edit mydata.");
//		MyData data = repository.findById((long)id);
//		mav.addObject("formModel", data);
		return mav;
	}
	
	public ModelAndView update(@ModelAttribute MyData mydata, ModelAndView mav) {
		repository.saveAndFlush(mydata);
		return new ModelAndView("redirect:/");
	}

	@PostConstruct
	public void init() {
		doProc("sasaki", 38, "mai@mai.com", "This is a memo.");
		doProc("hanako", 29, "hana@h.co.jp", "It was a Mm");
		doProc("jiro", 15, "jo@jiro.tmp", "That is a pen.");
	}

	private void doProc(String nm, int age, String ml, String mm) {
		MyData d = new MyData();
		d.setName(nm);
		d.setAge(age);
		d.setMail(ml);
		d.setMemo(mm);
		repository.saveAndFlush(d);
	}
}
