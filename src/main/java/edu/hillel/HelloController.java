package edu.hillel;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

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
    @RequestMapping(method = RequestMethod.POST)
    public String doPostWelcome(WebRequest request, ModelMap model){

        String user = request.getParameter("name");
        model.addAttribute("user", user);
        return "accepted";
    }
}
