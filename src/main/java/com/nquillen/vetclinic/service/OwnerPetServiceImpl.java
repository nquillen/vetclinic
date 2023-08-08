package com.nquillen.vetclinic.service;

import com.nquillen.vetclinic.Entity.Owner;
import com.nquillen.vetclinic.Entity.Pet;
import com.nquillen.vetclinic.dao.OwnerRepository;
import com.nquillen.vetclinic.dao.PetRepository;

import java.util.List;

public class OwnerPetServiceImpl implements OwnerPetService{

    private OwnerRepository ownerRepository;

    private PetRepository petRepository;

    @Override
    public List<Owner> findAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findOwnerAndPetsByOwnerId(int id) {
        return null;
    }

    @Override
    public Pet findPetByName(String name) {
        return petRepository.find;
    }

    @Override
    public Owner saveOwner(Owner owner) {
        return null;
    }

    @Override
    public Pet savePet(Pet pet) {
        return null;
    }

    @Override
    public void deleteOwnerById(int id) {

    }

    @Override
    public void deletePetById(int id) {

    }

    @Override
    public Owner findByOwnerName(String name) {
        return null;
    }

    @Override
    public Owner findByPhoneNumber(String phoneNumber) {
        return null;
    }
}
