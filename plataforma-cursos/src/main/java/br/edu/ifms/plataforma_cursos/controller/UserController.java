package br.edu.ifms.plataforma_cursos.controller;

import br.edu.ifms.plataforma_cursos.model.User;
import br.edu.ifms.plataforma_cursos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user) {

        userRepository.save(user);

        return "redirect:/";
    }
}