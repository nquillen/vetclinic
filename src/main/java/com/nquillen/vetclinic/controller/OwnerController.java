package com.nquillen.vetclinic.controller;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import com.nquillen.vetclinic.service.OwnerPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private OwnerPetService ownerPetService;


    @Autowired
    public OwnerController(OwnerPetService ownerPetService) {
        this.ownerPetService = ownerPetService;
    }

    // mapping for index which shows /list
    @GetMapping("/list")
    public String listOwners(Model theModel) {
        List<Owner> theOwners = ownerPetService.findAllOwners();

        theModel.addAttribute("owners", theOwners);

        return "owners/list-owners";
    }

    @PostMapping("/save")
    public String saveOwner(@ModelAttribute("owner") Owner theOwner) {
        System.out.println(theOwner);
        ownerPetService.saveOwner(theOwner);

        return "redirect:/owners/list";
    }

    @PostMapping("/savePet")
    public String savePet(@ModelAttribute("pet") Pet thePet, Model theModel) {

//        // Get the selected owner from the model
//        Owner selectedOwner = (Owner) theModel.getAttribute("selectedOwner");
//
//        // Set the owner for the pet and add it to the owner's list of pets
//        thePet.setOwner(selectedOwner);
//        selectedOwner.addPet(thePet);
        Owner theOwner = thePet.getOwner();
        System.out.println(theOwner);
        ownerPetService.savePet(thePet);


        return "redirect:/owners/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("ownerId") int theId) {
        ownerPetService.deleteOwnerById(theId);

        return "redirect:/owners/list";
    }

    @GetMapping("/showFormForAdd")
    public String addOwnerForm(Model theModel) {
        //model attributes to bind form data
        Owner theOwner = new Owner();

        theModel.addAttribute("owner", theOwner);

        return "owners/owner-form";
    }

    @GetMapping("/showFormForAddPet")
    public String addPetForm(@RequestParam("ownerId") int theId, Model theModel) {
        //model attributes to bind form data
        Owner theOwner = ownerPetService.findOwnerAndPetsByOwnerId(theId);

        Pet thePet = new Pet();
        theModel.addAttribute("pet", thePet);
        theModel.addAttribute("selectedOwner", theOwner);

        return "owners/pet-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("ownerId") int theId, Model theModel) {
        Owner theOwner = ownerPetService.findOwnerAndPetsByOwnerId(theId);

        theModel.addAttribute("owner", theOwner);
        System.out.println(theOwner);

        return "owners/owner-form";
    }



}
