package com.samar.voitures.repos;
import com.samar.voitures.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image , Long> {
}