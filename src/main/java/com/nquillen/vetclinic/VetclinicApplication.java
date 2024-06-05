package com.nquillen.vetclinic;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import com.nquillen.vetclinic.dao.OwnerRepository;
import com.nquillen.vetclinic.dao.PetRepository;
import com.nquillen.vetclinic.service.OwnerPetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class VetclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetclinicApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner (OwnerPetService ownerPetService) {
//		return runner -> {
//
//			int id = 16;
//
//			 System.out.println(ownerPetService.findAllOwners());
//			 System.out.println(ownerPetService.findOwnerAndPetsByOwnerId(id));
//
//			Owner tempOwner = ownerPetService.findOwnerAndPetsByOwnerId(16);
//			Pet tempPet = new Pet("Bill", "Cocker", 17, 25.0);
//			tempOwner.addPet(tempPet);
//			System.out.println("saving owner with new pet: " + tempOwner);
//			ownerPetService.saveOwner(tempOwner);

//			Pet pet = ownerPetService.findPetByPetId(6);
//			Owner tempOwner = pet.getOwner();
//			ownerPetService.deletePetById(7);

//			System.out.println(ownerPetService.findOwnerAndPetsByOwnerId(id));

//			Pet pet = ownerPetService.findPetByPetId(8);
//			pet.setAge(8);
//			ownerPetService.savePet(pet);

//			ownerPetService.deleteOwnerById(id);

//			Owner owner = ownerPetService.findOwnerAndPetsByOwnerId(id);
//			owner.setName("Fil");
//			ownerPetService.saveOwner(owner);

//			System.out.println(owner);

			// Owner owner = ownerPetService.findByPhoneNumber("5402410709");

//			List<Owner> owners = ownerPetService.findByOwnerName("Fil");
//
//			for (Owner owner : owners) {
//				System.out.println(owner);
//			}

//			List<Pet> pets = ownerPetService.findPetByName("midna");

//			for (Pet pet : pets) {
//				System.out.println(pet);
//			}


//		};
//	}


}