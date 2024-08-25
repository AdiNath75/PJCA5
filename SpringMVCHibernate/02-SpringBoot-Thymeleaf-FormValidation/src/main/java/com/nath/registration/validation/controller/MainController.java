package com.nath.registration.validation.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.registration.validation.dao.UserRepository;
import com.nath.registration.validation.entity.User;

@Controller
@RequestMapping("/users")
public class MainController {
	
	private UserRepository userRepo;
	
	@Autowired
	public MainController(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	@GetMapping("signup")
    public String showSignUpForm(User theUser) {
        return "register_form";
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }


   /* @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User theUser = userRepo.findById(id)
            .orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("user", theUser);
        return "update-user";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Student student, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            student.setId(id);
            return "update-student";
        }

        studentRepository.save(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        Student student = studentRepository.findById(id)
            .orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + id));
        studentRepository.delete(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
    */
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
		model.addAttribute("listProfession", listProfession);
		
		return "register_form";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user") User user,
			BindingResult bindingResult, Model model) {
		System.out.println(user);
		
		if (bindingResult.hasErrors()) {
			
			return "register_form";
		} else {
			return "register_success";
		}
	}
}
