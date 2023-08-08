package com.nquillen.vetclinic;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import com.nquillen.vetclinic.dao.OwnerRepository;
import com.nquillen.vetclinic.dao.PetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootApplication
public class VetclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetclinicApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (OwnerRepository ownerRepository, PetRepository petRepository) {
		return runner -> {
			// createOwner(ownerRespository);
			// deletePet(petRepository);
			// deleteOwner(ownerRespository);
			// ownerRespository.deleteAll();
			// petRepository.deleteAll();
			// createOwner(ownerRespository);
			// getPetById(petRepository);
			getOwnerById(ownerRepository);
		};
	}


		private void getOwnerById(OwnerRepository ownerRepository) {
		int id = 16;

		Optional<Owner> result = ownerRepository.findById(id);

		Owner tempOwner = null;
		if (result.isPresent()) {
			tempOwner = result.get();
		} else {
			throw new RuntimeException("Did not find owner id of: " + id);
		}
		System.out.println(tempOwner);

	}

	private void getPetById(PetRepository petRepository) {
		int id = 6;
		// Pet tempPet = petRepository.findById(id);

		// System.out.println("Pet: " + tempPet);
	}

	private void deleteOwner(OwnerRepository ownerRepository) {
		int id = 10;

		ownerRepository.deleteById(id);
		System.out.println("done");
	}


	private void deletePet(PetRepository petRepository) {
		int id = 1;

		petRepository.deleteById(id);
//		System.out.println("deleting Pet: " + tempPet);

//		petRepository.delete(tempPet);
		System.out.println("done!");
	}


	private static void createOwner(OwnerRepository ownerRepository) {
		Owner tempOwner = new Owner("Chris", "Chris@mail.com", "5402410709");
		tempOwner.addPet(new Pet("Bill", "Spaniel", 17, 26.7));

		System.out.println(tempOwner.getName() + " : " + tempOwner.getPets());


		ownerRepository.save(tempOwner);
	}

}
