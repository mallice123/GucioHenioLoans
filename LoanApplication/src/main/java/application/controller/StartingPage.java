package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartingPage {

    @RequestMapping("/")
    public String home() {
        return "startingView.html";
    }

}