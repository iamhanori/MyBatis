package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private myUserService service;

    // 사용자 등록 - form
    @GetMapping("/add")
    public String add_form() {
        return "write_form";
    }

    // 사용자 등록 - insert
    @PostMapping("/write")
    public String write(myUserDTO dto) {
        service.insert(dto);
        return "result";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<myUserDTO> list = service.listAll();
        model.addAttribute("list", list);
        return "list";
    }

}
