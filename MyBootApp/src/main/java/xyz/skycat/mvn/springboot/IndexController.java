package xyz.skycat.mvn.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/{num}")
	public String index(@PathVariable int num) {
		int res = 0;
		for (int i = 0; i < num; i++) {
			res += i;
		}
		return "total: " + res;
	}
}
