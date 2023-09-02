package com.course.taskManagement.controller;

import com.course.taskManagement.model.User;
import com.course.taskManagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AuthenticationController {
  private final UserService userService;

  @GetMapping("/login")
  public String login(Model model) {
    return "login"; // Nombre de la plantilla Thymeleaf para la página
  }

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("user", new User());
    return "register"; // Nombre de la plantilla Thymeleaf para la página
  }

  @PostMapping("/register")
  public String register(User user) {
    userService.registerUser(user);
    return "redirect:/login";
  }

}
