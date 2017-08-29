/**
 * 
 */
package cn.plk.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.plk.example.service.HelloService;

/**
 * @author {康培亮/AB052634}
 *
 */
@Controller
public class HelloController extends BaseController {
	
	@Autowired
	private HelloService helloService;
	
	@ResponseBody
    @RequestMapping("/")
    public String home() {
		String name = helloService.getName();
        return "Hello, " + name + ". Welcom To Spring Boot World!";
    }
	
}
