package com.example.userregistrationlogin.controller;

import com.example.userregistrationlogin.model.User;
import com.example.userregistrationlogin.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Ensure this view is correctly set up
    }

    @PostMapping("/register")
    public String registerUser(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "register"; // Return to the form with errors
        }

        // Check if user already exists
        if (userRepository.findByEmail(user.getEmail()) != null) {
            bindingResult.rejectValue("email", "error.user", "An account already exists with this email.");
            return "register"; // Return to the form with errors
        }

        userRepository.save(user);
        redirectAttributes.addFlashAttribute("message", "Registration successful!");
        return "redirect:/login"; // Redirect to login
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User()); // Create a new user object for the form
        return "login"; // Ensure this view is set up as well
    }

    @PostMapping("/login") // Method to handle login
    public String loginUser(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return "login"; // Return to the form with errors
        }

        User existingUser = userRepository.findByEmail(user.getEmail()); // Find user by email
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            model.addAttribute("error", "Invalid username or password."); // Show error if credentials are wrong
            return "login"; // Return to the login form
        }

        // Add a success message and redirect to the home page
        redirectAttributes.addFlashAttribute("message", "Login successful!");
        return "redirect:/home"; // Change this to the landing page you want
    }
}
