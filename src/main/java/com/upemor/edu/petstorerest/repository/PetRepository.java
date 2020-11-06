package com.upemor.edu.petstorerest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upemor.edu.petstorerest.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}