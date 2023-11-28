package com.samar.voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.samar.voitures.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long>{

}