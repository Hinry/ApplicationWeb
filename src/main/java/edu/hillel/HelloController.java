package edu.hillel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HillelNew8 on 28.11.2016.
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String doWelcome(ModelMap model){
        model.addAttribute("message", "Hello World!");
        return "welcome";
    }
}
