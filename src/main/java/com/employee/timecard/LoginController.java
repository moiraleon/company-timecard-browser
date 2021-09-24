package com.employee.timecard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login")
    public String getNewPage(Model model, @ModelAttribute LoginUser loginUser) {
        if (loginUser.getEmployeeID().equals("employeeID") && loginUser.getKeyCode() == loginUser.getKeyCode()) {
            model.addAttribute("msg", "Please Enter Employee Login Details");
            model.addAttribute("error", " ");
            return "clock-in";

        } else {
            model.addAttribute("error", "Invalid Login Information. Please try again.");
            return "login";
        }
    }


}
