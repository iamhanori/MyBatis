package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // 사용자 목록 - select
    @GetMapping("/list")
    public String list(Model model) {
        List<myUserDTO> list = service.listAll();
        model.addAttribute("list", list);
        return "list";
    }

    // 수정 - update - read
    @GetMapping("/update/{id}")
    public String read(@PathVariable("id") String id, Model model) {
        myUserDTO dto = service.read(id);
        model.addAttribute("dto", dto);
        return "read";
    }

    // 수정 - update - update
    @PostMapping("/update/{id}")
    public String update(myUserDTO dto) {
        service.update(dto);
        return "redirect:/list";
    }

    // 삭제 delete
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/list";
    }

}
