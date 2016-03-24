package io.github.howiefh.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.howiefh.provider.RegistryService;

@RequestMapping("/sendMoney")
@Controller
@Scope("prototype")
public class CustomerRegistryController {
    @Autowired
    RegistryService registryService;

    @RequestMapping("/createCustomer")
    public String createCustomer(HttpServletRequest request, HttpServletResponse response, Model model, String name){
        if (name == null || name.trim().length() == 0) {
            name = "dubbo";
        }
        String result = registryService.hello(name);
        model.addAttribute("result", result);
        return "index";
    }
}
