package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodByeContloller {
	@GetMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye!!";
	}
}
