package kr.hs.study.MyBatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
//    @GetMapping("/")
//    public @ResponseBody String home() {
//        return "welcome MyBatis";
//    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
