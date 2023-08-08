package com.nquillen.vetclinic.service;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OwnerPetService {

    List<Owner> findAllOwners();

    Owner findOwnerAndPetsByOwnerId(int id);

    Pet findPetByName(String name);

    Owner saveOwner(Owner owner);

    Pet savePet(Pet pet);

    void deleteOwnerById(int id);

    void deletePetById(int id);

    Owner findByOwnerName(String name);

    Owner findByPhoneNumber(String phoneNumber);





}
