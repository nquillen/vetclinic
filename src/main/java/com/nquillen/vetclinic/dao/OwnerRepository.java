package com.nquillen.vetclinic.dao;

import com.nquillen.vetclinic.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    List<Owner> findByName(String name);

    Owner findByPhoneNumber(String phoneNumber);

    Owner findByEmail(String email);

}
