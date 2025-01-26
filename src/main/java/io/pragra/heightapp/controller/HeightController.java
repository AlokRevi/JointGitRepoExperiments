package io.pragra.heightapp.controller;

import io.pragra.heightapp.service.HeightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeightController {

    private final HeightService heightService;

    public HeightController(HeightService heightService) {
        this.heightService = heightService;
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/submitHeight")
    public String submitHeight(@RequestParam int height, Model model) {
        String message = heightService.formatHeightMessage(height);
        model.addAttribute("message", message);
        return "index";
    }
}
