package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// コントローラクラスを定義
@Controller
public class HelloController {

	// Handlerメソッドを定義
	@GetMapping("/hello")
	@ResponseBody
	public String index() {
		
		// 戻り値はレスポンス本体
		return "こんにちは、世界！！！";
		
	}
	
	@GetMapping("/bye")
	@ResponseBody
	public String bye() {
		return "さよなら！！";
	}
}
