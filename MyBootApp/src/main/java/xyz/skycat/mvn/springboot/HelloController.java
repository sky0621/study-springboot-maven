package xyz.skycat.mvn.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	String[] names = { "taro", "jiro", "saburo" };
	String[] ages = { "30", "27", "20" };

	@RequestMapping("/{id}")
	public DataObject index(@PathVariable int id) {
		DataObject obj = new DataObject();
		obj.id = id;
		obj.name = names[id];
		obj.age = ages[id];
		return obj;
	}

	class DataObject {
		public int id;
		public String name;
		public String age;
	}
	
}
