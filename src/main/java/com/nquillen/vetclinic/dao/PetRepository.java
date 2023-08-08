package com.nquillen.vetclinic.dao;

import com.nquillen.vetclinic.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
