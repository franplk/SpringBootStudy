/**
 * 创建日期 : 2017年4月24日
 * 修改历史 : 
 *     1. [2017年4月24日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 */
@Controller
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
