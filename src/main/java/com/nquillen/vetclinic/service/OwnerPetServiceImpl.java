package com.nquillen.vetclinic.service;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import com.nquillen.vetclinic.dao.OwnerRepository;
import com.nquillen.vetclinic.dao.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerPetServiceImpl implements OwnerPetService{

    private OwnerRepository ownerRepository;

    private PetRepository petRepository;

    @Autowired
    public OwnerPetServiceImpl(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }




    @Override
    public List<Owner> findAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findOwnerAndPetsByOwnerId(int id) {

        Optional<Owner> result = ownerRepository.findById(id);

        Owner tempOwner = null;
        if (result.isPresent()) {
            tempOwner = result.get();
        } else {
            throw new RuntimeException("Did not find owner id of: " + id);
        }


        return tempOwner;
    }

    @Override
    public Pet findPetByPetId(int id) {
        Optional<Pet> optionalPet = petRepository.findById(id);
        Pet pet = null;

        if (optionalPet.isPresent()) {
            pet = optionalPet.get();
        } else {
            throw new RuntimeException("Did not find pet id of: " + id);
        }

        return pet;

    }


    @Override
    public void saveOwner(Owner owner) {ownerRepository.save(owner);
    }

    @Override
    public Pet savePet(Pet pet) {
        Owner owner = pet.getOwner();
        if (owner != null) {
            owner.getPets().add(pet); // Add the pet to the owner's pet list
        }

        return petRepository.save(pet);
    }


    @Override
    public void deleteOwnerById(int id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public void deletePetById(int id) {
        Pet pet = this.findPetByPetId(id);
        Owner owner = pet.getOwner();
        owner.getPets().remove(pet);
        petRepository.delete(pet);
    }

    //TODO
    @Override
    public List<Pet> findPetByName(String name) {
        return petRepository.findByPetName(name);
    }

    // TODO
    @Override
    public List<Owner> findByOwnerName(String name) {
        return ownerRepository.findByName(name);
    }

    //TODO
    @Override
    public Owner findByPhoneNumber(String phoneNumber) {
        return ownerRepository.findByPhoneNumber(phoneNumber);
    }
}
