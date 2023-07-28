package com.nquillen.vetclinic.dao;

import com.nquillen.vetclinic.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    
}
