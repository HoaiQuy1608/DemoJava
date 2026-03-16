package com.example.thonghoaiquy.controller;

import com.example.thonghoaiquy.model.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/")
    public String index(Model model) {
        Info info = new Info("Thòng Hoài Quý", "09/12/2004", "Nam", "2280614007", "Công nghệ thông tin");
        model.addAttribute("info", info);
        return "index";
    }
}
