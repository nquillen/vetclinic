package com.nquillen.vetclinic.dao;

import com.nquillen.vetclinic.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {


}
