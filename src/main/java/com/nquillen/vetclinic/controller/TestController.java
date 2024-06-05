package com.nquillen.vetclinic.controller;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.service.OwnerPetService;
import com.nquillen.vetclinic.service.OwnerPetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    private OwnerPetService ownerPetService;

    @Autowired
    public TestController(OwnerPetService ownerPetService) {
        this.ownerPetService = ownerPetService;
    }

    @GetMapping("/form")
    public String showTestForm(Model model) {
        Owner selectedOwner = ownerPetService.findOwnerAndPetsByOwnerId(19);
        model.addAttribute("selectedOwner", selectedOwner);
        System.out.println(selectedOwner);
        return "owners/test-form";
    }

    @PostMapping("/save")
    public String saveTestForm(@ModelAttribute("selectedOwner") Owner selectedOwner) {
        System.out.println("Selected Owner: " + selectedOwner);
        // Add logic to process the selectedOwner attribute
        return "redirect:/test/form"; // Redirect to the form again for testing
    }
}