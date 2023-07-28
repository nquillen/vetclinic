package com.nquillen.vetclinic.dao;

import com.nquillen.vetclinic.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRespository extends JpaRepository<Owner, Integer> {

}
