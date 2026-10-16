package in.ashokit.controller;

import in.ashokit.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping(value = "/")
    public String returnUserFrom(Model model){
        model.addAttribute("user",new User());
        return "user-form";
    }
    @PostMapping(value = "/register")
    public  String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result,Model model){
        if (result.hasErrors()){
//            model.addAttribute("user",new User());
            return "user-form";
        }else {
            model.addAttribute("message", "User registration success");
            return "welcome";
        }
    }
}
